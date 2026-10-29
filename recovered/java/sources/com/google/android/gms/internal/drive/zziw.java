            package com.google.android.gms.internal.drive;

            import java.util.AbstractList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     abstract class zziw<E> extends AbstractList<E> implements zzkp<E> {
                private boolean zznh = true;

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean add(E e) {
/* 1 */             zzbq();
/* 4 */             return super.add(e);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean addAll(Collection<? extends E> collection) {
/* 1 */             zzbq();
/* 4 */             return super.addAll(collection);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public void clear() {
/* 1 */             zzbq();
/* 4 */             super.clear();
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            if (!(obj instanceof RandomAccess)) {
/* 15 */                return super.equals(obj);
                    }
/* 20 */            List list = (List) obj;
/* 22 */            int size = size();
/* 30 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 34 */            for (int i = 0; i < size; i++) {
/* 48 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public int hashCode() {
/* 1 */             int size = size();
/* 5 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 23 */            return iHashCode;
                }

                @Override // java.util.AbstractList, java.util.List
                public E remove(int i) {
/* 1 */             zzbq();
/* 4 */             return (E) super.remove(i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean removeAll(Collection<?> collection) {
/* 1 */             zzbq();
/* 4 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean retainAll(Collection<?> collection) {
/* 1 */             zzbq();
/* 4 */             return super.retainAll(collection);
                }

                @Override // java.util.AbstractList, java.util.List
                public E set(int i, E e) {
/* 1 */             zzbq();
/* 4 */             return (E) super.set(i, e);
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public boolean zzbo() {
/* 1 */             return this.zznh;
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final void zzbp() {
/* 2 */             this.zznh = false;
                }

                public final void zzbq() {
/* 3 */             if (this.zznh) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                @Override // java.util.AbstractList, java.util.List
/* 8 */         public void add(int i, E e) {
/* 9 */             zzbq();
/* 10 */            super.add(i, e);
                }

                @Override // java.util.AbstractList, java.util.List
/* 8 */         public boolean addAll(int i, Collection<? extends E> collection) {
/* 9 */             zzbq();
/* 10 */            return super.addAll(i, collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 8 */         public boolean remove(Object obj) {
/* 9 */             zzbq();
/* 10 */            return super.remove(obj);
                }
            }
