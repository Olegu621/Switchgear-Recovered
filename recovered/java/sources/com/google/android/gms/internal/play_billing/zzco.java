            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import java.util.stream.Collector;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzco extends zzcj implements List, RandomAccess {
                private static final zzdx zza = new zzcl(zzdk.zza, 0);
                public static final /* synthetic */ int zzd = 0;

                public static zzco zzj(Object[] objArr, int i) {
                    return i == 0 ? zzdk.zza : new zzdk(objArr, i);
                }

                public static zzco zzk(Collection collection) {
/* 3 */             if (!(collection instanceof zzcj)) {
/* 27 */                Object[] array = collection.toArray();
/* 31 */                int length = array.length;
/* 32 */                zzdd.zzb(array, length);
/* 35 */                return zzj(array, length);
                    }
/* 7 */             zzco zzcoVarZzd = ((zzcj) collection).zzd();
/* 15 */            if (!zzcoVarZzd.zzf()) {
/* 26 */                return zzcoVarZzd;
                    }
/* 17 */            Object[] array2 = zzcoVarZzd.toArray();
/* 22 */            return zzj(array2, array2.length);
                }

                public static zzco zzl() {
/* 1 */             return zzdk.zza;
                }

                public static zzco zzm(Object obj) {
/* 1 */             Object[] objArr = {obj};
/* 6 */             zzdd.zzb(objArr, 1);
/* 9 */             return zzj(objArr, 1);
                }

                public static Collector zzo() {
/* 1 */             return zzbv.zza();
                }

                @Override // java.util.List
                @Deprecated
                public final void add(int i, Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.List
                @Deprecated
                public final boolean addAll(int i, Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override // java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 11 */            List list = (List) obj;
/* 13 */            int size = size();
/* 21 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 26 */            if (list instanceof RandomAccess) {
/* 29 */                for (int i = 0; i < size; i++) {
/* 43 */                    if (!zzbd.zza(get(i), list.get(i))) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    }
/* 50 */            Iterator it = iterator();
/* 54 */            Iterator it2 = list.iterator();
/* 62 */            while (it.hasNext()) {
/* 68 */                if (!it2.hasNext() || !zzbd.zza(it.next(), it2.next())) {
/* 7 */                     return false;
                        }
                    }
                    return !it2.hasNext();
                }

                @Override // java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 23 */            return iHashCode;
                }

                public int indexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 5 */             int size = size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 20 */                if (obj.equals(get(i))) {
/* 22 */                    return i;
                        }
                    }
/* 1 */             return -1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                public int lastIndexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 10 */            for (int size = size() - 1; size >= 0; size--) {
/* 20 */                if (obj.equals(get(size))) {
/* 22 */                    return size;
                        }
                    }
/* 1 */             return -1;
                }

                @Override // java.util.List
                public final /* synthetic */ ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                @Deprecated
                public final Object remove(int i) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.List
                @Deprecated
                public final Object set(int i, Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public int zza(Object[] objArr, int i) {
/* 1 */             int size = size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 12 */                objArr[i2] = get(i2);
                    }
/* 17 */            return size;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                @Deprecated
                public final zzco zzd() {
/* 1 */             return this;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                /* JADX INFO: renamed from: zze */
                public final zzdw iterator() {
/* 2 */             return listIterator(0);
                }

                public zzco zzh() {
                    return size() <= 1 ? this : new zzcm(this);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzi */
                public zzco subList(int i, int i2) {
/* 5 */             zzbe.zze(i, i2, size());
/* 8 */             int i3 = i2 - i;
/* 13 */            if (i3 == size()) {
/* 15 */                return this;
                    }
                    return i3 == 0 ? zzdk.zza : new zzcn(this, i, i3);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
                public final zzdx listIterator(int i) {
/* 7 */             zzbe.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
                    return isEmpty() ? zza : new zzcl(this, i);
                }
            }
