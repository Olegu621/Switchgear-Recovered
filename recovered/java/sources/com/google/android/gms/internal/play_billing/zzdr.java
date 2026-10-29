            package com.google.android.gms.internal.play_billing;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import java.util.Set;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdr extends zzcw {
                static final zzdr zzc;
                final transient zzco zzd;

                static {
/* 3 */             int i = zzco.zzd;
/* 12 */            zzc = new zzdr(zzdk.zza, zzdc.zza);
                }

                public zzdr(zzco zzcoVar, Comparator comparator) {
/* 1 */             super(comparator);
/* 4 */             this.zzd = zzcoVar;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
                public final Object ceiling(Object obj) {
/* 1 */             zzco zzcoVar = this.zzd;
/* 4 */             int iZzt = zzt(obj, true);
/* 12 */            if (iZzt == zzcoVar.size()) {
/* 14 */                return null;
                    }
/* 18 */            return this.zzd.get(iZzt);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
                        try {
/* 12 */                    if (Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza) >= 0) {
/* 14 */                        return true;
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
/* 1 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean containsAll(Collection collection) {
/* 3 */             if (collection instanceof zzdb) {
/* 7 */                 collection = ((zzdb) collection).zza();
                    }
/* 17 */            if (!zzdv.zza(((zzcw) this).zza, collection) || collection.size() <= 1) {
/* 88 */                return super.containsAll(collection);
                    }
/* 30 */            zzdx zzdxVarListIterator = this.zzd.listIterator(0);
/* 34 */            Iterator it = collection.iterator();
/* 42 */            if (!zzdxVarListIterator.hasNext()) {
/* 29 */                return false;
                    }
/* 45 */            Object next = it.next();
/* 49 */            E next2 = zzdxVarListIterator.next();
                    while (true) {
                        try {
/* 55 */                    int iCompare = ((zzcw) this).zza.compare(next2, next);
/* 59 */                    if (iCompare < 0) {
/* 65 */                        if (!zzdxVarListIterator.hasNext()) {
/* 29 */                            return false;
                                }
/* 68 */                        next2 = zzdxVarListIterator.next();
                            } else {
/* 73 */                        if (iCompare != 0) {
/* 29 */                            return false;
                                }
/* 79 */                        if (!it.hasNext()) {
/* 23 */                            return true;
                                }
/* 82 */                        next = it.next();
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Set)) {
/* 7 */                 return false;
                    }
/* 11 */            Set set = (Set) obj;
/* 23 */            if (this.zzd.size() != set.size()) {
/* 7 */                 return false;
                    }
/* 30 */            if (isEmpty()) {
/* 1 */                 return true;
                    }
/* 39 */            if (!zzdv.zza(((zzcw) this).zza, set)) {
/* 78 */                return containsAll(set);
                    }
/* 41 */            Iterator it = set.iterator();
                    try {
/* 47 */                zzdx zzdxVarListIterator = this.zzd.listIterator(0);
/* 55 */                while (zzdxVarListIterator.hasNext()) {
/* 57 */                    E next = zzdxVarListIterator.next();
/* 61 */                    Object next2 = it.next();
/* 65 */                    if (next2 == null || ((zzcw) this).zza.compare(next, next2) != 0) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    } catch (ClassCastException | NoSuchElementException unused) {
/* 7 */                 return false;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
                public final Object first() {
/* 5 */             if (!isEmpty()) {
/* 10 */                return this.zzd.get(0);
                    }
/* 15 */            C1951n4.m6864o();
/* 18 */            return null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
                public final Object floor(Object obj) {
/* 7 */             int iZzs = zzs(obj, true) - 1;
/* 8 */             if (iZzs == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.zzd.get(iZzs);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
                public final Object higher(Object obj) {
/* 1 */             zzco zzcoVar = this.zzd;
/* 4 */             int iZzt = zzt(obj, false);
/* 12 */            if (iZzt == zzcoVar.size()) {
/* 14 */                return null;
                    }
/* 18 */            return this.zzd.get(iZzt);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 4 */             return this.zzd.listIterator(0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
                public final Object last() {
/* 5 */             if (isEmpty()) {
/* 20 */                C1951n4.m6864o();
/* 23 */                return null;
                    }
/* 7 */             zzco zzcoVar = this.zzd;
/* 15 */            return zzcoVar.get(zzcoVar.size() - 1);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
                public final Object lower(Object obj) {
/* 7 */             int iZzs = zzs(obj, false) - 1;
/* 8 */             if (iZzs == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.zzd.get(iZzs);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 3 */             return this.zzd.size();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zza(Object[] objArr, int i) {
/* 4 */             return this.zzd.zza(objArr, 0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zzb() {
/* 3 */             return this.zzd.zzb();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zzc() {
/* 3 */             return this.zzd.zzc();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                public final zzco zzd() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                /* JADX INFO: renamed from: zze */
                public final zzdw iterator() {
/* 4 */             return this.zzd.listIterator(0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final Object[] zzg() {
/* 3 */             return this.zzd.zzg();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw
                public final zzcw zzl() {
/* 3 */             Comparator comparatorReverseOrder = Collections.reverseOrder(((zzcw) this).zza);
                    return isEmpty() ? zzcw.zzq(comparatorReverseOrder) : new zzdr(this.zzd.zzh(), comparatorReverseOrder);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw
                public final zzcw zzm(Object obj, boolean z) {
/* 6 */             return zzu(0, zzs(obj, z));
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw
                public final zzcw zzo(Object obj, boolean z, Object obj2, boolean z2) {
/* 5 */             return zzp(obj, z).zzm(obj2, z2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw
                public final zzcw zzp(Object obj, boolean z) {
/* 11 */            return zzu(zzt(obj, z), this.zzd.size());
                }

                @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
                /* JADX INFO: renamed from: zzr */
                public final zzdw descendingIterator() {
/* 8 */             return this.zzd.zzh().listIterator(0);
                }

                public final int zzs(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza);
/* 12 */            if (iBinarySearch >= 0) {
                        return z ? iBinarySearch + 1 : iBinarySearch;
                    }
/* 19 */            return ~iBinarySearch;
                }

                public final int zzt(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza);
/* 12 */            if (iBinarySearch >= 0) {
                        return z ? iBinarySearch : iBinarySearch + 1;
                    }
/* 20 */            return ~iBinarySearch;
                }

                public final zzdr zzu(int i, int i2) {
/* 1 */             if (i == 0) {
/* 9 */                 if (i2 == this.zzd.size()) {
/* 13 */                    return this;
                        }
/* 11 */                i = 0;
                    }
/* 14 */            if (i >= i2) {
/* 32 */                return zzcw.zzq(((zzcw) this).zza);
                    }
/* 16 */            zzco zzcoVar = this.zzd;
/* 26 */            return new zzdr(zzcoVar.subList(i, i2), ((zzcw) this).zza);
                }
            }
