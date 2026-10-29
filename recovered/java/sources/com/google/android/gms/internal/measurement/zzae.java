            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.SortedMap;
            import java.util.TreeMap;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class zzae implements Iterable, zzao, zzak {
                final SortedMap zza;
                final Map zzb;

                public zzae(List list) {
/* 1 */             this();
/* 4 */             if (list != null) {
/* 11 */                for (int i = 0; i < list.size(); i++) {
/* 19 */                    zzn(i, (zzao) list.get(i));
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzae)) {
/* 7 */                 return false;
                    }
/* 11 */            zzae zzaeVar = (zzae) obj;
/* 21 */            if (zzh() != zzaeVar.zzh()) {
/* 7 */                 return false;
                    }
/* 24 */            SortedMap sortedMap = this.zza;
/* 30 */            if (sortedMap.isEmpty()) {
/* 34 */                return zzaeVar.zza.isEmpty();
                    }
/* 59 */            for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
/* 73 */                if (!zzl(iIntValue).equals(zzaeVar.zzl(iIntValue))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 7 */             return this.zza.hashCode() * 31;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new zzad(this);
                }

                public final String toString() {
/* 3 */             return zzs(",");
                }

                public final List zzb() {
/* 7 */             ArrayList arrayList = new ArrayList(zzh());
/* 15 */            for (int i = 0; i < zzh(); i++) {
/* 21 */                arrayList.add(zzl(i));
                    }
/* 27 */            return arrayList;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 3 */             return zzs(",");
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
                    return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzba.zza(str, this, zzgVar, list) : zzak.zzu(this, new zzas(str), zzgVar, list);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 1 */             SortedMap sortedMap = this.zza;
/* 8 */             if (sortedMap.size() == 1) {
/* 15 */                return zzl(0).zzd();
                    }
                    return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 1 */             return Boolean.TRUE;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 23 */            return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
                }

                public final Iterator zzg() {
/* 7 */             return this.zza.keySet().iterator();
                }

                public final int zzh() {
/* 1 */             SortedMap sortedMap = this.zza;
/* 7 */             if (sortedMap.isEmpty()) {
/* 9 */                 return 0;
                    }
/* 21 */            return ((Integer) sortedMap.lastKey()).intValue() + 1;
                }

                public final int zzi() {
/* 3 */             return this.zza.size();
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final boolean zzj(String str) {
                    return "length".equals(str) || this.zzb.containsKey(str);
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final zzao zzk(String str) {
                    zzao zzaoVar;
/* 7 */             if ("length".equals(str)) {
/* 20 */                return new zzah(Double.valueOf(zzh()));
                    }
                    return (!zzj(str) || (zzaoVar = (zzao) this.zzb.get(str)) == null) ? zzao.zzf : zzaoVar;
                }

                public final zzao zzl(int i) {
                    zzao zzaoVar;
/* 5 */             if (i < zzh()) {
                        return (!zzo(i) || (zzaoVar = (zzao) this.zza.get(Integer.valueOf(i))) == null) ? zzao.zzf : zzaoVar;
                    }
/* 33 */            s80.m8425f("Attempting to get element outside of current array");
/* 36 */            return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzak
                public final void zzm(String str, zzao zzaoVar) {
/* 1 */             Map map = this.zzb;
/* 3 */             if (zzaoVar == null) {
/* 5 */                 map.remove(str);
                    } else {
/* 9 */                 map.put(str, zzaoVar);
                    }
                }

                public final void zzn(int i, zzao zzaoVar) {
/* 3 */             if (i > 32468) {
/* 54 */                f42.m3656l("Array too large");
/* 57 */                return;
                    }
/* 5 */             if (i < 0) {
/* 48 */                s80.m8425f(fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
/* 51 */                return;
                    }
/* 7 */             SortedMap sortedMap = this.zza;
/* 9 */             if (zzaoVar == null) {
/* 15 */                sortedMap.remove(Integer.valueOf(i));
                    } else {
/* 23 */                sortedMap.put(Integer.valueOf(i), zzaoVar);
                    }
                }

                public final boolean zzo(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 SortedMap sortedMap = this.zza;
/* 15 */                if (i <= ((Integer) sortedMap.lastKey()).intValue()) {
/* 21 */                    return sortedMap.containsKey(Integer.valueOf(i));
                        }
                    }
/* 47 */            s80.m8425f(fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
/* 50 */            return false;
                }

                public final void zzp() {
/* 3 */             this.zza.clear();
                }

                public final void zzq(int i, zzao zzaoVar) {
/* 1 */             if (i < 0) {
/* 75 */                C1951n4.m6859j(fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 21), "Invalid value index: ", i));
/* 78 */                return;
                    }
/* 7 */             if (i >= zzh()) {
/* 9 */                 zzn(i, zzaoVar);
/* 12 */                return;
                    }
/* 13 */            SortedMap sortedMap = this.zza;
/* 25 */            for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i; iIntValue--) {
/* 27 */                Integer numValueOf = Integer.valueOf(iIntValue);
/* 35 */                zzao zzaoVar2 = (zzao) sortedMap.get(numValueOf);
/* 37 */                if (zzaoVar2 != null) {
/* 41 */                    zzn(iIntValue + 1, zzaoVar2);
/* 44 */                    sortedMap.remove(numValueOf);
                        }
                    }
/* 50 */            zzn(i, zzaoVar);
                }

                public final void zzr(int i) {
/* 1 */             SortedMap sortedMap = this.zza;
/* 9 */             int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
/* 13 */            if (i > iIntValue || i < 0) {
/* 86 */                return;
                    }
/* 22 */            sortedMap.remove(Integer.valueOf(i));
/* 25 */            if (i == iIntValue) {
/* 27 */                int i2 = i - 1;
/* 29 */                Integer numValueOf = Integer.valueOf(i2);
/* 37 */                if (sortedMap.containsKey(numValueOf) || i2 < 0) {
/* 86 */                    return;
                        }
/* 43 */                sortedMap.put(numValueOf, zzao.zzf);
/* 46 */                return;
                    }
                    while (true) {
/* 47 */                i++;
/* 59 */                if (i > ((Integer) sortedMap.lastKey()).intValue()) {
/* 86 */                    return;
                        }
/* 61 */                Integer numValueOf2 = Integer.valueOf(i);
/* 69 */                zzao zzaoVar = (zzao) sortedMap.get(numValueOf2);
/* 71 */                if (zzaoVar != null) {
/* 79 */                    sortedMap.put(Integer.valueOf(i - 1), zzaoVar);
/* 82 */                    sortedMap.remove(numValueOf2);
                        }
                    }
                }

                public final String zzs(String str) {
                    String str2;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 12 */            if (!this.zza.isEmpty()) {
/* 15 */                int i = 0;
                        while (true) {
/* 21 */                    str2 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
/* 26 */                    if (i >= zzh()) {
                                break;
                            }
/* 28 */                    zzao zzaoVarZzl = zzl(i);
/* 32 */                    sb.append(str2);
/* 37 */                    if (!(zzaoVarZzl instanceof zzat) && !(zzaoVarZzl instanceof zzam)) {
/* 47 */                        sb.append(zzaoVarZzl.zzc());
                            }
/* 50 */                    i++;
                        }
/* 57 */                sb.delete(0, str2.length());
                    }
/* 60 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 3 */             zzae zzaeVar = new zzae();
/* 20 */            for (Map.Entry entry : this.zza.entrySet()) {
/* 32 */                boolean z = entry.getValue() instanceof zzak;
/* 34 */                SortedMap sortedMap = zzaeVar.zza;
/* 36 */                if (z) {
/* 50 */                    sortedMap.put((Integer) entry.getKey(), (zzao) entry.getValue());
                        } else {
/* 70 */                    sortedMap.put((Integer) entry.getKey(), ((zzao) entry.getValue()).zzt());
                        }
                    }
/* 74 */            return zzaeVar;
                }

/* 25 */        public zzae() {
                    this.zza = new TreeMap();
/* 27 */            this.zzb = new TreeMap();
                }
            }
