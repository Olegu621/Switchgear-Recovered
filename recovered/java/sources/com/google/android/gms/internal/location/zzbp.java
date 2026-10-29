            package com.google.android.gms.internal.location;

            import java.io.Serializable;
            import java.lang.reflect.Array;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import org.checkerframework.checker.nullness.compatqual.NullableDecl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 57 */    public abstract class zzbp<E> extends AbstractCollection<E> implements Serializable {
                private static final Object[] zza = new Object[0];

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean add(E e) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean addAll(Collection<? extends E> collection) {
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
                public final boolean removeAll(Collection<?> collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                @Deprecated
                public final boolean retainAll(Collection<?> collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
/* 1 */             tArr.getClass();
/* 4 */             int size = size();
/* 8 */             int length = tArr.length;
/* 9 */             if (length < size) {
/* 11 */                Object[] objArrZzb = zzb();
/* 15 */                if (objArrZzb != null) {
/* 44 */                    return (T[]) Arrays.copyOfRange(objArrZzb, zzc(), zzd(), tArr.getClass());
                        }
/* 29 */                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                    } else if (length > size) {
/* 52 */                tArr[size] = null;
                    }
/* 55 */            zzg(tArr, 0);
                    return tArr;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public abstract zzbu<E> iterator();

                @NullableDecl
                public Object[] zzb() {
/* 2 */             throw null;
                }

                public int zzc() {
/* 2 */             throw null;
                }

                public int zzd() {
/* 2 */             throw null;
                }

                public zzbs<E> zze() {
/* 2 */             throw null;
                }

                public abstract boolean zzf();

                public int zzg(Object[] objArr, int i) {
/* 2 */             throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
/* 58 */        public final Object[] toArray() {
/* 59 */            return toArray(zza);
                }
            }
