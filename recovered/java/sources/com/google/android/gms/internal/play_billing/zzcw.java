            package com.google.android.gms.internal.play_billing;

            import java.util.Comparator;
            import java.util.NavigableSet;
            import java.util.SortedSet;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public abstract class zzcw extends zzcv implements NavigableSet, zzdu {
                final transient Comparator zza;
                transient zzcw zzb;

                public zzcw(Comparator comparator) {
/* 4 */             this.zza = comparator;
                }

                public static zzdr zzq(Comparator comparator) {
/* 7 */             if (zzdc.zza.equals(comparator)) {
/* 9 */                 return zzdr.zzc;
                    }
/* 14 */            int i = zzco.zzd;
/* 18 */            return new zzdr(zzdk.zza, comparator);
                }

                @Deprecated
                public final void addFirst(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Deprecated
                public final void addLast(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.NavigableSet
                public Object ceiling(Object obj) {
/* 1 */             obj.getClass();
/* 10 */            return zzcx.zza(zzp(obj, true), null);
                }

                @Override // java.util.SortedSet, com.google.android.gms.internal.play_billing.zzdu
                public final Comparator comparator() {
/* 1 */             return this.zza;
                }

                @Override // java.util.NavigableSet
                public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
/* 1 */             zzcw zzcwVar = this.zzb;
/* 3 */             if (zzcwVar != null) {
/* 13 */                return zzcwVar;
                    }
/* 5 */             zzcw zzcwVarZzl = zzl();
/* 9 */             this.zzb = zzcwVarZzl;
/* 11 */            zzcwVarZzl.zzb = this;
/* 13 */            return zzcwVarZzl;
                }

                @Override // java.util.SortedSet
                public Object first() {
/* 5 */             return iterator().next();
                }

                @Override // java.util.NavigableSet
                public Object floor(Object obj) {
/* 1 */             obj.getClass();
/* 14 */            return zzda.zza(zzm(obj, true).descendingIterator(), null);
                }

                public final Object getFirst() {
/* 1 */             return first();
                }

                public final Object getLast() {
/* 1 */             return last();
                }

                @Override // java.util.NavigableSet, java.util.SortedSet
                public final /* synthetic */ SortedSet headSet(Object obj) {
/* 1 */             obj.getClass();
/* 5 */             return zzm(obj, false);
                }

                @Override // java.util.NavigableSet
                public Object higher(Object obj) {
/* 1 */             obj.getClass();
/* 10 */            return zzcx.zza(zzp(obj, false), null);
                }

                @Override // java.util.SortedSet
                public Object last() {
/* 5 */             return descendingIterator().next();
                }

                @Override // java.util.NavigableSet
                public Object lower(Object obj) {
/* 1 */             obj.getClass();
/* 14 */            return zzda.zza(zzm(obj, false).descendingIterator(), null);
                }

                @Override // java.util.NavigableSet
                @Deprecated
                public final Object pollFirst() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.NavigableSet
                @Deprecated
                public final Object pollLast() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Deprecated
                public final Object removeFirst() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Deprecated
                public final Object removeLast() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.NavigableSet, java.util.SortedSet
                public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
/* 3 */             return subSet(obj, true, obj2, false);
                }

                @Override // java.util.NavigableSet, java.util.SortedSet
                public final /* synthetic */ SortedSet tailSet(Object obj) {
/* 1 */             obj.getClass();
/* 5 */             return zzp(obj, true);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: zze */
                public abstract zzdw iterator();

                public abstract zzcw zzl();

                public abstract zzcw zzm(Object obj, boolean z);

                @Override // java.util.NavigableSet
                /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
                public final zzcw subSet(Object obj, boolean z, Object obj2, boolean z2) {
/* 1 */             obj.getClass();
/* 4 */             obj2.getClass();
/* 13 */            if (this.zza.compare(obj, obj2) <= 0) {
/* 15 */                return zzo(obj, z, obj2, z2);
                    }
/* 20 */            f42.m3649e();
/* 23 */            return null;
                }

                public abstract zzcw zzo(Object obj, boolean z, Object obj2, boolean z2);

                public abstract zzcw zzp(Object obj, boolean z);

                @Override // java.util.NavigableSet
                /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
                public abstract zzdw descendingIterator();

                @Override // java.util.NavigableSet
/* 9 */         public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
/* 10 */            obj.getClass();
/* 11 */            return zzm(obj, z);
                }

                @Override // java.util.NavigableSet
/* 9 */         public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
/* 10 */            obj.getClass();
/* 11 */            return zzp(obj, z);
                }
            }
