            package com.google.android.recaptcha.internal;

            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public abstract class zzml extends zzmm implements Collection {
                public boolean add(Object obj) {
/* 5 */             return zzc().add(obj);
                }

                public boolean addAll(Collection collection) {
/* 5 */             return zzc().addAll(collection);
                }

                @Override // java.util.Collection
                public final void clear() {
/* 5 */             zzc().clear();
                }

                @Override // java.util.Collection
                public final boolean contains(Object obj) {
/* 5 */             return zzc().contains(obj);
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 5 */             return zzc().containsAll(collection);
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
/* 5 */             return zzc().isEmpty();
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 5 */             return zzc().iterator();
                }

                @Override // java.util.Collection
                public final boolean remove(Object obj) {
/* 5 */             return zzc().remove(obj);
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 5 */             return zzc().removeAll(collection);
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 5 */             return zzc().retainAll(collection);
                }

                @Override // java.util.Collection
                public final int size() {
/* 5 */             return zzc().size();
                }

                @Override // java.util.Collection
                public final Object[] toArray() {
/* 5 */             return zzc().toArray();
                }

                @Override // com.google.android.recaptcha.internal.zzmm
                public /* bridge */ /* synthetic */ Object zzb() {
/* 2 */             throw null;
                }

                public abstract Collection zzc();

                @Override // java.util.Collection
/* 9 */         public final Object[] toArray(Object[] objArr) {
/* 10 */            return zzc().toArray(objArr);
                }
            }
