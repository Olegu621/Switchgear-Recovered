            package com.google.android.gms.internal.fido;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzaz extends zzaw implements List, RandomAccess {
                private static final zzbg zza = new zzax(zzbc.zza, 0);

                public static zzaz zzg(Object[] objArr) {
/* 2 */             return zzh(objArr, objArr.length);
                }

                public static zzaz zzh(Object[] objArr, int i) {
                    return i == 0 ? zzbc.zza : new zzbc(objArr, i);
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
                public final boolean contains(Object obj) {
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
/* 43 */                    if (!zzar.zza(get(i), list.get(i))) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    }
/* 50 */            Iterator it = iterator();
/* 54 */            Iterator it2 = list.iterator();
/* 62 */            while (it.hasNext()) {
/* 68 */                if (!it2.hasNext() || !zzar.zza(it.next(), it2.next())) {
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

                @Override // java.util.List
                public final int indexOf(Object obj) {
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

                @Override // com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                public final int lastIndexOf(Object obj) {
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

                @Override // com.google.android.gms.internal.fido.zzaw
                public int zza(Object[] objArr, int i) {
/* 1 */             int size = size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 12 */                objArr[i2] = get(i2);
                    }
/* 17 */            return size;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                /* JADX INFO: renamed from: zzd */
                public final zzbf iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzf */
                public zzaz subList(int i, int i2) {
/* 5 */             zzas.zze(i, i2, size());
/* 8 */             int i3 = i2 - i;
/* 13 */            if (i3 == size()) {
/* 15 */                return this;
                    }
                    return i3 == 0 ? zzbc.zza : new zzay(this, i, i3);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
                public final zzbg listIterator(int i) {
/* 7 */             zzas.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
                    return isEmpty() ? zza : new zzax(this, i);
                }
            }
