            package com.google.android.gms.internal.measurement;

            import java.util.AbstractList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     abstract class zzkt extends AbstractList implements zzmn {
                private boolean zza;

                public zzkt(boolean z) {
/* 4 */             this.zza = z;
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean add(Object obj) {
/* 1 */             zzcF();
/* 4 */             return super.add(obj);
                }

                @Override // java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             zzcF();
/* 4 */             return super.addAll(i, collection);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             zzcF();
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
/* 33 */            for (int i = 0; i < size; i++) {
/* 47 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 23 */            return iHashCode;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             zzcF();
/* 4 */             int iIndexOf = indexOf(obj);
/* 9 */             if (iIndexOf == -1) {
/* 11 */                return false;
                    }
/* 13 */            remove(iIndexOf);
/* 16 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean removeAll(Collection collection) {
/* 1 */             zzcF();
/* 4 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean retainAll(Collection collection) {
/* 1 */             zzcF();
/* 4 */             return super.retainAll(collection);
                }

                @Override // java.util.AbstractList, java.util.List
                public Object set(int i, Object obj) {
/* 1 */             zzcF();
/* 4 */             return super.set(i, obj);
                }

                @Override // com.google.android.gms.internal.measurement.zzmn
                public final boolean zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.measurement.zzmn
                public final void zzb() {
/* 3 */             if (this.zza) {
/* 6 */                 this.zza = false;
                    }
                }

                public final void zzcF() {
/* 3 */             if (this.zza) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                @Override // java.util.AbstractList, java.util.List
/* 8 */         public void add(int i, Object obj) {
/* 9 */             zzcF();
/* 10 */            super.add(i, obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 8 */         public boolean addAll(Collection collection) {
/* 9 */             zzcF();
/* 10 */            return super.addAll(collection);
                }

                @Override // java.util.AbstractList, java.util.List
/* 17 */        public Object remove(int i) {
/* 18 */            zzcF();
/* 19 */            return super.remove(i);
                }
            }
