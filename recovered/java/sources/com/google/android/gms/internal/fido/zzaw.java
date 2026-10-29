            package com.google.android.gms.internal.fido;

            import java.io.Serializable;
            import java.lang.reflect.Array;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 57 */    public abstract class zzaw extends AbstractCollection implements Serializable {
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

                @Override // java.util.AbstractCollection, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int size = size();
/* 8 */             int length = objArr.length;
/* 9 */             if (length < size) {
/* 11 */                Object[] objArrZze = zze();
/* 15 */                if (objArrZze != null) {
/* 44 */                    return Arrays.copyOfRange(objArrZze, zzc(), zzb(), objArr.getClass());
                        }
/* 29 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                    } else if (length > size) {
/* 52 */                objArr[size] = null;
                    }
/* 55 */            zza(objArr, 0);
/* 58 */            return objArr;
                }

                public int zza(Object[] objArr, int i) {
/* 2 */             throw null;
                }

                public int zzb() {
/* 6 */             throw new UnsupportedOperationException();
                }

                public int zzc() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
                public abstract zzbf iterator();

                public Object[] zze() {
/* 1 */             return null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
/* 58 */        public final Object[] toArray() {
/* 59 */            return toArray(zza);
                }
            }
