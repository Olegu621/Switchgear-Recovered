            package com.google.android.gms.internal.location;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import org.checkerframework.checker.nullness.compatqual.NullableDecl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {
                private static final zzbv<Object> zza = new zzbq(zzbt.zza, 0);

                public static <E> zzbs<E> zzi() {
/* 1 */             return (zzbs<E>) zzbt.zza;
                }

                public static <E> zzbs<E> zzj(Collection<? extends E> collection) {
/* 3 */             if (collection instanceof zzbp) {
/* 7 */                 zzbs<E> zzbsVarZze = ((zzbp) collection).zze();
/* 15 */                if (!zzbsVarZze.zzf()) {
/* 26 */                    return zzbsVarZze;
                        }
/* 17 */                Object[] array = zzbsVarZze.toArray();
/* 22 */                return zzk(array, array.length);
                    }
/* 27 */            Object[] array2 = collection.toArray();
/* 31 */            int length = array2.length;
/* 33 */            for (int i = 0; i < length; i++) {
/* 37 */                if (array2[i] == null) {
/* 48 */                    StringBuilder sb = new StringBuilder(20);
/* 53 */                    sb.append("at index ");
/* 56 */                    sb.append(i);
/* 66 */                    throw new NullPointerException(sb.toString());
                        }
                    }
/* 67 */            return zzk(array2, length);
                }

                public static <E> zzbs<E> zzk(Object[] objArr, int i) {
                    return i == 0 ? (zzbs<E>) zzbt.zza : new zzbt(objArr, i);
                }

                @Override // java.util.List
                @Deprecated
                public final void add(int i, E e) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.List
                @Deprecated
                public final boolean addAll(int i, Collection<? extends E> collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(@NullableDecl Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override // java.util.Collection, java.util.List
                public final boolean equals(@NullableDecl Object obj) {
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
/* 43 */                    if (!zzbl.zza(get(i), list.get(i))) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    }
/* 50 */            Iterator<E> it = iterator();
/* 54 */            Iterator<E> it2 = list.iterator();
/* 62 */            while (it.hasNext()) {
/* 68 */                if (!it2.hasNext() || !zzbl.zza(it.next(), it2.next())) {
/* 7 */                     return false;
                        }
                    }
                    return !it2.hasNext();
                }

                @Override // java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int size = size();
/* 5 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 23 */            return iHashCode;
                }

                @Override // java.util.List
                public final int indexOf(@NullableDecl Object obj) {
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

                @Override // com.google.android.gms.internal.location.zzbp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* bridge */ /* synthetic */ Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                public final int lastIndexOf(@NullableDecl Object obj) {
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
                public final /* bridge */ /* synthetic */ ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                @Deprecated
                public final E remove(int i) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.List
                @Deprecated
                public final E set(int i, E e) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // com.google.android.gms.internal.location.zzbp
                /* JADX INFO: renamed from: zza */
                public final zzbu<E> iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // com.google.android.gms.internal.location.zzbp
                public final zzbs<E> zze() {
/* 1 */             return this;
                }

                @Override // com.google.android.gms.internal.location.zzbp
                public int zzg(Object[] objArr, int i) {
/* 1 */             int size = size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 12 */                objArr[i2] = get(i2);
                    }
/* 17 */            return size;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzh */
                public zzbs<E> subList(int i, int i2) {
/* 5 */             zzbm.zzc(i, i2, size());
/* 8 */             int i3 = i2 - i;
/* 13 */            if (i3 == size()) {
/* 15 */                return this;
                    }
                    return i3 == 0 ? (zzbs<E>) zzbt.zza : new zzbr(this, i, i3);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
                public final zzbv<E> listIterator(int i) {
/* 7 */             zzbm.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
                    return isEmpty() ? (zzbv<E>) zza : new zzbq(this, i);
                }
            }
