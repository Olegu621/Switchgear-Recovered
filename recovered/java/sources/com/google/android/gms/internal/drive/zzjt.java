            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 88 */    final class zzjt implements zzns {
                private final zzjr zznx;

                private zzjt(zzjr zzjrVar) {
/* 10 */            zzjr zzjrVar2 = (zzjr) zzkm.zza(zzjrVar, "output");
/* 12 */            this.zznx = zzjrVar2;
/* 14 */            zzjrVar2.zzoh = this;
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zza(int i, List<Integer> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzc(i, list.get(i2).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzac = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzac += zzjr.zzac(list.get(i3).intValue());
                    }
/* 38 */            this.zznx.zzy(iZzac);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzx(list.get(i2).intValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzak(int i) throws IOException {
/* 4 */             this.zznx.zzb(i, 3);
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzal(int i) throws IOException {
/* 4 */             this.zznx.zzb(i, 4);
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzf(i, list.get(i2).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzaf = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzaf += zzjr.zzaf(list.get(i3).intValue());
                    }
/* 38 */            this.zznx.zzy(iZzaf);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzaa(list.get(i2).intValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzc(int i, List<Long> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zza(i, list.get(i2).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzo = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzo += zzjr.zzo(list.get(i3).longValue());
                    }
/* 38 */            this.zznx.zzy(iZzo);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzl(list.get(i2).longValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final int zzcd() {
/* 1 */             return zzkk.zze.zzsi;
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzd(int i, List<Long> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zza(i, list.get(i2).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzp = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzp += zzjr.zzp(list.get(i3).longValue());
                    }
/* 38 */            this.zznx.zzy(iZzp);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzl(list.get(i2).longValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zze(int i, List<Long> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzc(i, list.get(i2).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzr = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzr += zzjr.zzr(list.get(i3).longValue());
                    }
/* 38 */            this.zznx.zzy(iZzr);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzn(list.get(i2).longValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzf(int i, List<Float> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zza(i, list.get(i2).floatValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzb = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzb += zzjr.zzb(list.get(i3).floatValue());
                    }
/* 38 */            this.zznx.zzy(iZzb);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zza(list.get(i2).floatValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzg(int i, List<Double> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zza(i, list.get(i2).doubleValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzb = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzb += zzjr.zzb(list.get(i3).doubleValue());
                    }
/* 38 */            this.zznx.zzy(iZzb);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zza(list.get(i2).doubleValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzc(i, list.get(i2).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzah = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzah += zzjr.zzah(list.get(i3).intValue());
                    }
/* 38 */            this.zznx.zzy(iZzah);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzx(list.get(i2).intValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzb(i, list.get(i2).booleanValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzd = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzd += zzjr.zzd(list.get(i3).booleanValue());
                    }
/* 38 */            this.zznx.zzy(iZzd);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzc(list.get(i2).booleanValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzd(i, list.get(i2).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzad = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzad += zzjr.zzad(list.get(i3).intValue());
                    }
/* 38 */            this.zznx.zzy(iZzad);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzy(list.get(i2).intValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzf(i, list.get(i2).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzag = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzag += zzjr.zzag(list.get(i3).intValue());
                    }
/* 38 */            this.zznx.zzy(iZzag);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzaa(list.get(i2).intValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzl(int i, List<Long> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzc(i, list.get(i2).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzs = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzs += zzjr.zzs(list.get(i3).longValue());
                    }
/* 38 */            this.zznx.zzy(iZzs);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzn(list.get(i2).longValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zze(i, list.get(i2).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzae = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzae += zzjr.zzae(list.get(i3).intValue());
                    }
/* 38 */            this.zznx.zzy(iZzae);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzz(list.get(i2).intValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
                public final void zzn(int i, List<Long> list, boolean z) throws IOException {
/* 1 */             int i2 = 0;
/* 2 */             if (!z) {
/* 69 */                while (i2 < list.size()) {
/* 83 */                    this.zznx.zzb(i, list.get(i2).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 7 */             this.zznx.zzb(i, 2);
/* 11 */            int iZzq = 0;
/* 16 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 32 */                iZzq += zzjr.zzq(list.get(i3).longValue());
                    }
/* 38 */            this.zznx.zzy(iZzq);
/* 45 */            while (i2 < list.size()) {
/* 59 */                this.zznx.zzm(list.get(i2).longValue());
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zza(int i, float f) throws IOException {
/* 90 */            this.zznx.zza(i, f);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzb(int i, long j) throws IOException {
/* 90 */            this.zznx.zzb(i, j);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzc(int i, long j) throws IOException {
/* 90 */            this.zznx.zzc(i, j);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzd(int i, int i2) throws IOException {
/* 90 */            this.zznx.zzd(i, i2);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zze(int i, int i2) throws IOException {
/* 90 */            this.zznx.zze(i, i2);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzf(int i, int i2) throws IOException {
/* 90 */            this.zznx.zzf(i, i2);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzi(int i, long j) throws IOException {
/* 91 */            this.zznx.zza(i, j);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzj(int i, long j) throws IOException {
/* 91 */            this.zznx.zzc(i, j);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzm(int i, int i2) throws IOException {
/* 91 */            this.zznx.zzf(i, i2);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 89 */        public final void zzn(int i, int i2) throws IOException {
/* 91 */            this.zznx.zzc(i, i2);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 90 */        public final void zza(int i, double d) throws IOException {
/* 91 */            this.zznx.zza(i, d);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 90 */        public final void zzb(int i, Object obj, zzmf zzmfVar) throws IOException {
/* 91 */            zzjr zzjrVar = this.zznx;
/* 92 */            zzjrVar.zzb(i, 3);
/* 93 */            zzmfVar.zza((zzlq) obj, zzjrVar.zzoh);
/* 94 */            zzjrVar.zzb(i, 4);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 90 */        public final void zzc(int i, int i2) throws IOException {
/* 91 */            this.zznx.zzc(i, i2);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 91 */        public final void zza(int i, long j) throws IOException {
/* 92 */            this.zznx.zza(i, j);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 92 */        public final void zza(int i, String str) throws IOException {
/* 93 */            this.zznx.zza(i, str);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 93 */        public final void zza(int i, zzjc zzjcVar) throws IOException {
/* 94 */            this.zznx.zza(i, zzjcVar);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 94 */        public final void zza(int i, Object obj, zzmf zzmfVar) throws IOException {
/* 95 */            this.zznx.zza(i, (zzlq) obj, zzmfVar);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 94 */        public final void zzb(int i, boolean z) throws IOException {
/* 95 */            this.zznx.zzb(i, z);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 95 */        public final void zza(int i, Object obj) throws IOException {
/* 96 */            boolean z = obj instanceof zzjc;
/* 97 */            zzjr zzjrVar = this.zznx;
                    if (z) {
/* 98 */                zzjrVar.zzb(i, (zzjc) obj);
                    } else {
/* 99 */                zzjrVar.zza(i, (zzlq) obj);
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 95 */        public final void zzb(int i, List<zzjc> list) throws IOException {
/* 96 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 97 */                this.zznx.zza(i, list.get(i2));
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 97 */        public final void zzb(int i, List<?> list, zzmf zzmfVar) throws IOException {
/* 98 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 99 */                zzb(i, list.get(i2), zzmfVar);
                    }
                }

/* 99 */        public static zzjt zza(zzjr zzjrVar) {
/* 100 */           zzjt zzjtVar = zzjrVar.zzoh;
                    return zzjtVar != null ? zzjtVar : new zzjt(zzjrVar);
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 101 */       public final void zza(int i, List<String> list) throws IOException {
                    int i2 = 0;
/* 102 */           if (list instanceof zzkz) {
/* 103 */               zzkz zzkzVar = (zzkz) list;
/* 104 */               while (i2 < list.size()) {
/* 105 */                   Object objZzao = zzkzVar.zzao(i2);
/* 106 */                   boolean z = objZzao instanceof String;
/* 107 */                   zzjr zzjrVar = this.zznx;
                            if (z) {
/* 108 */                       zzjrVar.zza(i, (String) objZzao);
                            } else {
/* 109 */                       zzjrVar.zza(i, (zzjc) objZzao);
                            }
                            i2++;
                        }
                        return;
                    }
/* 110 */           while (i2 < list.size()) {
/* 111 */               this.zznx.zza(i, list.get(i2));
                        i2++;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 111 */       public final void zza(int i, List<?> list, zzmf zzmfVar) throws IOException {
/* 112 */           for (int i2 = 0; i2 < list.size(); i2++) {
/* 113 */               zza(i, list.get(i2), zzmfVar);
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzns
/* 113 */       public final <K, V> void zza(int i, zzlj<K, V> zzljVar, Map<K, V> map) throws IOException {
                    for (Map.Entry<K, V> entry : map.entrySet()) {
/* 115 */               this.zznx.zzb(i, 2);
/* 118 */               this.zznx.zzy(zzli.zza(zzljVar, entry.getKey(), entry.getValue()));
/* 119 */               zzli.zza(this.zznx, zzljVar, entry.getKey(), entry.getValue());
                    }
                }
            }
