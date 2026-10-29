            package com.google.android.gms.internal.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzah extends zzac implements List, RandomAccess {
                private static final zzal zza = new zzae(zzaj.zza, 0);
                public static final /* synthetic */ int zzd = 0;

                public static zzah zzj() {
/* 1 */             return zzaj.zza;
                }

                public static zzah zzk(Object obj) {
/* 1 */             Object[] objArr = {obj};
/* 6 */             zzai.zza(objArr, 1);
/* 9 */             return zzq(objArr, 1);
                }

                public static zzah zzl(Object obj, Object obj2) {
/* 1 */             Object[] objArr = {obj, obj2};
/* 6 */             zzai.zza(objArr, 2);
/* 9 */             return zzq(objArr, 2);
                }

                public static zzah zzm(Object obj, Object obj2, Object obj3) {
/* 1 */             Object[] objArr = {obj, obj2, obj3};
/* 6 */             zzai.zza(objArr, 3);
/* 9 */             return zzq(objArr, 3);
                }

                public static zzah zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
/* 1 */             Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
/* 6 */             zzai.zza(objArr, 6);
/* 9 */             return zzq(objArr, 6);
                }

                public static zzah zzo(Iterable iterable) {
/* 1 */             iterable.getClass();
/* 6 */             if (iterable instanceof Collection) {
/* 10 */                return zzp((Collection) iterable);
                    }
/* 15 */            Iterator it = iterable.iterator();
/* 23 */            if (!it.hasNext()) {
/* 25 */                return zzaj.zza;
                    }
/* 28 */            Object next = it.next();
/* 36 */            if (!it.hasNext()) {
/* 38 */                return zzk(next);
                    }
/* 46 */            zzad zzadVar = new zzad(4);
/* 49 */            zzadVar.zzb(next);
/* 52 */            zzadVar.zzc(it);
/* 55 */            return zzadVar.zzd();
                }

                public static zzah zzp(Collection collection) {
/* 3 */             if (!(collection instanceof zzac)) {
/* 27 */                Object[] array = collection.toArray();
/* 31 */                int length = array.length;
/* 32 */                zzai.zza(array, length);
/* 35 */                return zzq(array, length);
                    }
/* 7 */             zzah zzahVarZze = ((zzac) collection).zze();
/* 15 */            if (!zzahVarZze.zzf()) {
/* 26 */                return zzahVarZze;
                    }
/* 17 */            Object[] array2 = zzahVarZze.toArray();
/* 22 */            return zzq(array2, array2.length);
                }

                public static zzah zzq(Object[] objArr, int i) {
                    return i == 0 ? zzaj.zza : new zzaj(objArr, i);
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

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
/* 43 */                    if (!Objects.equals(get(i), list.get(i))) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    }
/* 50 */            Iterator it = iterator();
/* 54 */            Iterator it2 = list.iterator();
/* 62 */            while (it.hasNext()) {
/* 68 */                if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
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

                @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

                @Override // com.google.android.gms.internal.common.zzac
                /* JADX INFO: renamed from: zza */
                public final zzak iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // com.google.android.gms.internal.common.zzac
                @Deprecated
                public final zzah zze() {
/* 1 */             return this;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public int zzg(Object[] objArr, int i) {
/* 1 */             int size = size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 12 */                objArr[i2] = get(i2);
                    }
/* 17 */            return size;
                }

                public zzah zzh() {
                    return size() <= 1 ? this : new zzaf(this);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzi */
                public zzah subList(int i, int i2) {
/* 5 */             zzr.zzd(i, i2, size());
/* 8 */             int i3 = i2 - i;
/* 13 */            if (i3 == size()) {
/* 15 */                return this;
                    }
                    return i3 == 0 ? zzaj.zza : new zzag(this, i, i3);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
                public final zzal listIterator(int i) {
/* 7 */             zzr.zzc(i, size(), FirebaseAnalytics.Param.INDEX);
                    return isEmpty() ? zza : new zzae(this, i);
                }
            }
