            package com.google.android.gms.internal.common;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Spliterator;
            import java.util.Spliterators;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public abstract class zzac extends AbstractCollection implements Serializable {
                private static final Object[] zza = new Object[0];

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean addAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final void clear() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean remove(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean removeAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean retainAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Spliterator spliterator() {
/* 3 */             return Spliterators.spliterator(this, 1296);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int size = size();
/* 8 */             int length = objArr.length;
/* 10 */            if (length < size) {
/* 12 */                Object[] objArrZzb = zzb();
/* 16 */                if (objArrZzb != null) {
/* 41 */                    return Arrays.copyOfRange(objArrZzb, zzc(), zzd(), objArr.getClass());
                        }
/* 18 */                if (length != 0) {
/* 20 */                    objArr = Arrays.copyOf(objArr, 0);
                        }
/* 24 */                objArr = Arrays.copyOf(objArr, size);
                    } else if (length > size) {
/* 49 */                objArr[size] = null;
                    }
/* 51 */            zzg(objArr, 0);
/* 54 */            return objArr;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public abstract zzak iterator();

                public Object[] zzb() {
/* 1 */             return null;
                }

                public int zzc() {
/* 6 */             throw new UnsupportedOperationException();
                }

                public int zzd() {
/* 6 */             throw new UnsupportedOperationException();
                }

                public zzah zze() {
/* 2 */             throw null;
                }

                public abstract boolean zzf();

                public int zzg(Object[] objArr, int i) {
/* 2 */             throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
/* 54 */        public final Object[] toArray() {
/* 55 */            return toArray(zza);
                }
            }
