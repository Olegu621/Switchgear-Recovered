            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.C1951n4;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    final class zzmh {
                private static final Class<?> zzuz = zzep();
                private static final zzmx<?, ?> zzva = zzf(false);
                private static final zzmx<?, ?> zzvb = zzf(true);
                private static final zzmx<?, ?> zzvc = new zzmz();

                public static <UT, UB> UB zza(int i, List<Integer> list, zzko zzkoVar, UB ub, zzmx<UT, UB> zzmxVar) {
/* 1 */             if (zzkoVar == null) {
/* 3 */                 return ub;
                    }
/* 6 */             if (!(list instanceof RandomAccess)) {
/* 57 */                Iterator<Integer> it = list.iterator();
/* 65 */                while (it.hasNext()) {
/* 73 */                    int iIntValue = it.next().intValue();
/* 81 */                    if (!zzkoVar.zzan(iIntValue)) {
/* 83 */                        ub = (UB) zza(i, iIntValue, ub, zzmxVar);
/* 87 */                        it.remove();
                            }
                        }
                        return ub;
                    }
/* 8 */             int size = list.size();
/* 13 */            int i2 = 0;
/* 14 */            for (int i3 = 0; i3 < size; i3++) {
/* 16 */                Integer num = list.get(i3);
/* 22 */                int iIntValue2 = num.intValue();
/* 30 */                if (zzkoVar.zzan(iIntValue2)) {
/* 32 */                    if (i3 != i2) {
/* 34 */                        list.set(i2, num);
                            }
/* 37 */                    i2++;
                        } else {
/* 40 */                    ub = (UB) zza(i, iIntValue2, ub, zzmxVar);
                        }
                    }
/* 47 */            if (i2 != size) {
/* 53 */                list.subList(i2, size).clear();
                    }
                    return ub;
                }

                public static int zzb(List<Long> list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzle)) {
/* 31 */                int iZzp = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzp += zzjr.zzp(list.get(i).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzp;
                    }
/* 13 */            zzle zzleVar = (zzle) list;
/* 15 */            int iZzp2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzp2 += zzjr.zzp(zzleVar.getLong(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzp2;
                }

                public static int zzc(int i, List<?> list) {
/* 1 */             int size = list.size();
/* 5 */             int i2 = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iZzab = zzjr.zzab(i) * size;
/* 16 */            if (!(list instanceof zzkz)) {
/* 50 */                while (i2 < size) {
/* 52 */                    Object obj = list.get(i2);
/* 66 */                    iZzab = (obj instanceof zzjc ? zzjr.zzb((zzjc) obj) : zzjr.zzm((String) obj)) + iZzab;
/* 76 */                    i2++;
                        }
/* 79 */                return iZzab;
                    }
/* 18 */            zzkz zzkzVar = (zzkz) list;
/* 20 */            while (i2 < size) {
/* 22 */                Object objZzao = zzkzVar.zzao(i2);
/* 36 */                iZzab = (objZzao instanceof zzjc ? zzjr.zzb((zzjc) objZzao) : zzjr.zzm((String) objZzao)) + iZzab;
/* 46 */                i2++;
                    }
/* 49 */            return iZzab;
                }

                public static int zzd(List<Integer> list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzkl)) {
/* 31 */                int iZzah = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzah += zzjr.zzah(list.get(i).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzah;
                    }
/* 13 */            zzkl zzklVar = (zzkl) list;
/* 15 */            int iZzah2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzah2 += zzjr.zzah(zzklVar.getInt(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzah2;
                }

                public static int zze(List<Integer> list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzkl)) {
/* 31 */                int iZzac = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzac += zzjr.zzac(list.get(i).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzac;
                    }
/* 13 */            zzkl zzklVar = (zzkl) list;
/* 15 */            int iZzac2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzac2 += zzjr.zzac(zzklVar.getInt(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzac2;
                }

                public static zzmx<?, ?> zzem() {
/* 1 */             return zzva;
                }

                public static zzmx<?, ?> zzen() {
/* 1 */             return zzvb;
                }

                public static zzmx<?, ?> zzeo() {
/* 1 */             return zzvc;
                }

                private static Class<?> zzep() {
                    try {
/* 3 */                 return Class.forName("com.google.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 8 */                 return null;
                    }
                }

                private static Class<?> zzeq() {
                    try {
/* 3 */                 return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
                    } catch (Throwable unused) {
/* 8 */                 return null;
                    }
                }

                public static int zzf(List<Integer> list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzkl)) {
/* 31 */                int iZzad = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzad += zzjr.zzad(list.get(i).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzad;
                    }
/* 13 */            zzkl zzklVar = (zzkl) list;
/* 15 */            int iZzad2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzad2 += zzjr.zzad(zzklVar.getInt(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzad2;
                }

                public static int zzg(List<Integer> list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzkl)) {
/* 31 */                int iZzae = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzae += zzjr.zzae(list.get(i).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzae;
                    }
/* 13 */            zzkl zzklVar = (zzkl) list;
/* 15 */            int iZzae2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzae2 += zzjr.zzae(zzklVar.getInt(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzae2;
                }

                public static void zzh(int i, List<Integer> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zza(i, list, z);
                }

                public static void zzi(int i, List<Integer> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zzj(i, list, z);
                }

                public static void zzj(int i, List<Integer> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zzm(i, list, z);
                }

                public static void zzk(int i, List<Integer> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zzb(i, list, z);
                }

                public static void zzl(int i, List<Integer> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zzk(i, list, z);
                }

                public static void zzm(int i, List<Integer> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zzh(i, list, z);
                }

                public static void zzn(int i, List<Boolean> list, zzns zznsVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zznsVar.zzi(i, list, z);
                }

                public static int zzo(int i, List<Long> list, boolean z) {
/* 5 */             if (list.size() == 0) {
/* 7 */                 return 0;
                    }
/* 22 */            return (zzjr.zzab(i) * list.size()) + zza(list);
                }

                public static int zzp(int i, List<Long> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (zzjr.zzab(i) * size) + zzb(list);
                }

                public static int zzq(int i, List<Long> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (zzjr.zzab(i) * size) + zzc(list);
                }

                public static int zzr(int i, List<Integer> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (zzjr.zzab(i) * size) + zzd(list);
                }

                public static int zzs(int i, List<Integer> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (zzjr.zzab(i) * size) + zze(list);
                }

                public static int zzt(int i, List<Integer> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (zzjr.zzab(i) * size) + zzf(list);
                }

                public static int zzu(int i, List<Integer> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (zzjr.zzab(i) * size) + zzg(list);
                }

                public static int zzv(int i, List<?> list, boolean z) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            return zzjr.zzj(i, 0) * size;
                }

                public static int zzw(int i, List<?> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return zzjr.zzg(i, 0L) * size;
                }

                public static int zzx(int i, List<?> list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 14 */            return zzjr.zzc(i, true) * size;
                }

/* 12 */        public static int zzh(List<?> list) {
/* 13 */            return list.size() << 2;
                }

/* 12 */        public static int zzi(List<?> list) {
/* 13 */            return list.size() << 3;
                }

/* 12 */        public static int zzj(List<?> list) {
/* 13 */            return list.size();
                }

/* 52 */        public static void zzb(int i, List<zzjc> list, zzns zznsVar) throws IOException {
/* 53 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 54 */            zznsVar.zzb(i, list);
                }

/* 52 */        public static void zzd(int i, List<Long> list, zzns zznsVar, boolean z) throws IOException {
/* 53 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 54 */            zznsVar.zzd(i, list, z);
                }

/* 52 */        public static void zze(int i, List<Long> list, zzns zznsVar, boolean z) throws IOException {
/* 53 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 54 */            zznsVar.zzn(i, list, z);
                }

/* 52 */        public static void zzf(int i, List<Long> list, zzns zznsVar, boolean z) throws IOException {
/* 53 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 54 */            zznsVar.zze(i, list, z);
                }

/* 52 */        public static void zzg(int i, List<Long> list, zzns zznsVar, boolean z) throws IOException {
/* 53 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 54 */            zznsVar.zzl(i, list, z);
                }

/* 54 */        public static void zzb(int i, List<?> list, zzns zznsVar, zzmf zzmfVar) throws IOException {
/* 55 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 56 */            zznsVar.zzb(i, list, zzmfVar);
                }

/* 54 */        public static int zzd(int i, List<zzjc> list) {
/* 55 */            int size = list.size();
                    if (size == 0) {
                        return 0;
                    }
/* 56 */            int iZzab = zzjr.zzab(i) * size;
/* 57 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 58 */                iZzab += zzjr.zzb(list.get(i2));
                    }
                    return iZzab;
                }

/* 54 */        private static zzmx<?, ?> zzf(boolean z) {
                    try {
/* 55 */                Class<?> clsZzeq = zzeq();
                        if (clsZzeq == null) {
                            return null;
                        }
/* 56 */                return (zzmx) clsZzeq.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
                    } catch (Throwable unused) {
                        return null;
                    }
                }

/* 54 */        public static void zzg(Class<?> cls) {
                    Class<?> cls2;
/* 55 */            if (zzkk.class.isAssignableFrom(cls) || (cls2 = zzuz) == null || cls2.isAssignableFrom(cls)) {
                        return;
                    }
/* 57 */            C1951n4.m6859j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }

/* 56 */        public static void zzb(int i, List<Float> list, zzns zznsVar, boolean z) throws IOException {
/* 57 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 58 */            zznsVar.zzf(i, list, z);
                }

/* 58 */        public static int zzd(int i, List<zzlq> list, zzmf zzmfVar) {
/* 59 */            int size = list.size();
                    if (size == 0) {
                        return 0;
                    }
                    int iZzc = 0;
                    for (int i2 = 0; i2 < size; i2++) {
/* 60 */                iZzc += zzjr.zzc(i, list.get(i2), zzmfVar);
                    }
                    return iZzc;
                }

/* 60 */        public static boolean zzd(Object obj, Object obj2) {
                    if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
                    return true;
                }

/* 79 */        public static int zzc(List<Long> list) {
/* 80 */            int size = list.size();
                    int i = 0;
                    if (size == 0) {
                        return 0;
                    }
/* 81 */            if (!(list instanceof zzle)) {
                        int iZzq = 0;
                        while (i < size) {
/* 84 */                    iZzq += zzjr.zzq(list.get(i).longValue());
                            i++;
                        }
                        return iZzq;
                    }
/* 82 */            zzle zzleVar = (zzle) list;
                    int iZzq2 = 0;
                    while (i < size) {
/* 83 */                iZzq2 += zzjr.zzq(zzleVar.getLong(i));
                        i++;
                    }
                    return iZzq2;
                }

/* 84 */        public static void zzc(int i, List<Long> list, zzns zznsVar, boolean z) throws IOException {
/* 85 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 86 */            zznsVar.zzc(i, list, z);
                }

/* 86 */        public static int zzc(int i, Object obj, zzmf zzmfVar) {
/* 87 */            if (obj instanceof zzkx) {
/* 88 */                return zzjr.zza(i, (zzkx) obj);
                    }
/* 89 */            return zzjr.zzb(i, (zzlq) obj, zzmfVar);
                }

/* 89 */        public static int zzc(int i, List<?> list, zzmf zzmfVar) {
                    int iZza;
/* 90 */            int size = list.size();
                    if (size == 0) {
                        return 0;
                    }
/* 91 */            int iZzab = zzjr.zzab(i) * size;
                    for (int i2 = 0; i2 < size; i2++) {
/* 92 */                Object obj = list.get(i2);
/* 93 */                if (obj instanceof zzkx) {
/* 94 */                    iZza = zzjr.zza((zzkx) obj);
                        } else {
/* 95 */                    iZza = zzjr.zza((zzlq) obj, zzmfVar);
                        }
                        iZzab = iZza + iZzab;
                    }
                    return iZzab;
                }

/* 91 */        public static void zza(int i, List<String> list, zzns zznsVar) throws IOException {
/* 92 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 93 */            zznsVar.zza(i, list);
                }

/* 93 */        public static void zza(int i, List<?> list, zzns zznsVar, zzmf zzmfVar) throws IOException {
/* 94 */            if (list == null || list.isEmpty()) {
                        return;
                    }
/* 95 */            zznsVar.zza(i, list, zzmfVar);
                }

/* 95 */        public static int zza(List<Long> list) {
/* 96 */            int size = list.size();
                    int i = 0;
                    if (size == 0) {
                        return 0;
                    }
/* 97 */            if (!(list instanceof zzle)) {
                        int iZzo = 0;
                        while (i < size) {
/* 100 */                   iZzo += zzjr.zzo(list.get(i).longValue());
                            i++;
                        }
                        return iZzo;
                    }
/* 98 */            zzle zzleVar = (zzle) list;
                    int iZzo2 = 0;
                    while (i < size) {
/* 99 */                iZzo2 += zzjr.zzo(zzleVar.getLong(i));
                        i++;
                    }
                    return iZzo2;
                }

/* 100 */       public static <T> void zza(zzll zzllVar, T t, T t2, long j) {
/* 103 */           zznd.zza(t, j, zzllVar.zzb(zznd.zzo(t, j), zznd.zzo(t2, j)));
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 103 */       public static <T, FT extends zzkd<FT>> void zza(zzjy<FT> zzjyVar, T t, T t2) {
/* 104 */           zzkb<T> zzkbVarZzb = zzjyVar.zzb(t2);
/* 105 */           if (zzkbVarZzb.zzos.isEmpty()) {
                        return;
                    }
/* 107 */           zzjyVar.zzc(t).zza(zzkbVarZzb);
                }

/* 107 */       public static <T, UT, UB> void zza(zzmx<UT, UB> zzmxVar, T t, T t2) {
/* 111 */           zzmxVar.zze(t, zzmxVar.zzg(zzmxVar.zzr(t), zzmxVar.zzr(t2)));
                }

/* 111 */       public static void zza(int i, List<Double> list, zzns zznsVar, boolean z) throws IOException {
/* 112 */           if (list == null || list.isEmpty()) {
                        return;
                    }
/* 113 */           zznsVar.zzg(i, list, z);
                }

/* 113 */       private static <UT, UB> UB zza(int i, int i2, UB ub, zzmx<UT, UB> zzmxVar) {
                    if (ub == null) {
/* 114 */               ub = zzmxVar.zzez();
                    }
/* 115 */           zzmxVar.zza(ub, i, i2);
                    return ub;
                }
            }
