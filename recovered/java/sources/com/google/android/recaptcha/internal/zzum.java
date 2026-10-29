            package com.google.android.recaptcha.internal;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzum extends AbstractSet {
                final /* synthetic */ zzuo zza;

                public /* synthetic */ zzum(zzuo zzuoVar, zzun zzunVar) {
/* 1 */             this.zza = zzuoVar;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             if (contains(entry)) {
/* 26 */                return false;
                    }
/* 21 */            this.zza.put((Comparable) entry.getKey(), entry.getValue());
/* 24 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
/* 3 */             this.zza.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 9 */             Object obj2 = this.zza.get(entry.getKey());
/* 13 */            Object value = entry.getValue();
/* 18 */            if (obj2 != value) {
                        return obj2 != null && obj2.equals(value);
                    }
/* 17 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 6 */             return new zzul(this.zza, null);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             if (!contains(entry)) {
/* 20 */                return false;
                    }
/* 15 */            this.zza.remove(entry.getKey());
/* 18 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 3 */             return this.zza.size();
                }
            }
