            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.util.List;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzny {
                public static final /* synthetic */ int zza = 0;
                private static final zzoh zzb;

                static {
/* 1 */             int i = zznt.zza;
/* 8 */             zzb = new zzoj();
                }

                public static zzoh zzA() {
/* 1 */             return zzb;
                }

                public static boolean zzB(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static void zzC(zzlr zzlrVar, Object obj, Object obj2) {
/* 11 */            if (((zzmb) obj2).zzb.zza.isEmpty()) {
/* 13 */                return;
                    }
/* 17 */            throw null;
                }

                public static void zzD(zzoh zzohVar, Object obj, Object obj2) {
/* 1 */             zzme zzmeVar = (zzme) obj;
/* 3 */             zzoi zzoiVarZzc = zzmeVar.zzc;
/* 7 */             zzoi zzoiVar = ((zzme) obj2).zzc;
/* 17 */            if (!zzoi.zza().equals(zzoiVar)) {
/* 27 */                if (zzoi.zza().equals(zzoiVarZzc)) {
/* 29 */                    zzoiVarZzc = zzoi.zzc(zzoiVarZzc, zzoiVar);
                        } else {
/* 34 */                    zzoiVarZzc.zzl(zzoiVar);
                        }
                    }
/* 37 */            zzmeVar.zzc = zzoiVarZzc;
                }

                public static Object zzE(Object obj, int i, int i2, Object obj2, zzoh zzohVar) {
/* 1 */             if (obj2 == null) {
/* 3 */                 obj2 = zzohVar.zza(obj);
                    }
/* 17 */            ((zzoi) obj2).zzk(i << 3, Long.valueOf(i2));
/* 20 */            return obj2;
                }

                public static void zza(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzC(i, list, z);
                }

                public static void zzb(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzB(i, list, z);
                }

                public static void zzc(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzy(i, list, z);
                }

                public static void zzd(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzz(i, list, z);
                }

                public static void zze(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzL(i, list, z);
                }

                public static void zzf(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzA(i, list, z);
                }

                public static void zzg(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzJ(i, list, z);
                }

                public static void zzh(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzw(i, list, z);
                }

                public static void zzi(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzH(i, list, z);
                }

                public static void zzj(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzK(i, list, z);
                }

                public static void zzk(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzx(i, list, z);
                }

                public static void zzl(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzI(i, list, z);
                }

                public static void zzm(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzD(i, list, z);
                }

                public static void zzn(int i, List list, zzou zzouVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzouVar.zzE(i, list, z);
                }

                public static int zzo(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzmz)) {
/* 31 */                int iZzA = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzA += zzll.zzA(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzA;
                    }
/* 13 */            zzmz zzmzVar = (zzmz) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzA2 += zzll.zzA(zzmzVar.zzc(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzA2;
                }

                public static int zzp(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzmz)) {
/* 31 */                int iZzA = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzA += zzll.zzA(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzA;
                    }
/* 13 */            zzmz zzmzVar = (zzmz) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzA2 += zzll.zzA(zzmzVar.zzc(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzA2;
                }

                public static int zzq(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof zzmz)) {
/* 37 */                int iZzA = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iZzA += zzll.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 62 */                return iZzA;
                    }
/* 15 */            zzmz zzmzVar = (zzmz) list;
/* 17 */            int iZzA2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jZzc = zzmzVar.zzc(i);
/* 32 */                iZzA2 += zzll.zzA((jZzc >> 63) ^ (jZzc + jZzc));
/* 33 */                i++;
                    }
/* 36 */            return iZzA2;
                }

                public static int zzr(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzmf)) {
/* 32 */                int iZzA = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzA += zzll.zzA(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 54 */                return iZzA;
                    }
/* 13 */            zzmf zzmfVar = (zzmf) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzA2 += zzll.zzA(zzmfVar.zzf(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzA2;
                }

                public static int zzs(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzmf)) {
/* 32 */                int iZzA = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzA += zzll.zzA(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 54 */                return iZzA;
                    }
/* 13 */            zzmf zzmfVar = (zzmf) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzA2 += zzll.zzA(zzmfVar.zzf(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzA2;
                }

                public static int zzt(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzmf)) {
/* 31 */                int iZzz = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzz += zzll.zzz(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzz;
                    }
/* 13 */            zzmf zzmfVar = (zzmf) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzz2 += zzll.zzz(zzmfVar.zzf(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzz2;
                }

                public static int zzu(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzmf)) {
/* 36 */                int iZzz = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iZzz += zzll.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 62 */                return iZzz;
                    }
/* 13 */            zzmf zzmfVar = (zzmf) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iZzf = zzmfVar.zzf(i);
/* 31 */                iZzz2 += zzll.zzz((iZzf >> 31) ^ (iZzf + iZzf));
/* 32 */                i++;
                    }
/* 35 */            return iZzz2;
                }

                public static int zzv(List list) {
/* 5 */             return list.size() * 4;
                }

                public static int zzw(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzll.zzz(i << 3) + 4) * size;
                }

                public static int zzx(List list) {
/* 5 */             return list.size() * 8;
                }

                public static int zzy(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzll.zzz(i << 3) + 8) * size;
                }

                public static int zzz(int i, Object obj, zznw zznwVar) {
/* 1 */             int i2 = i << 3;
/* 5 */             if (!(obj instanceof zzmv)) {
/* 32 */                return zzll.zzD((zznl) obj, zznwVar) + zzll.zzz(i2);
                    }
/* 9 */             int iZzz = zzll.zzz(i2);
/* 13 */            int iZzb = ((zzmv) obj).zzb();
/* 17 */            return pm2.m7493p(iZzb, iZzb, iZzz);
                }
            }
