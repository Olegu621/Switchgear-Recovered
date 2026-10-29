            package com.google.android.gms.internal.auth;

            import java.util.AbstractList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhd extends AbstractList implements RandomAccess, zzfe {
                private final zzfe zza;

                public zzhd(zzfe zzfeVar) {
/* 4 */             this.zza = zzfeVar;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object get(int i) {
/* 5 */             return ((zzfd) this.zza).get(i);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator iterator() {
/* 3 */             return new zzhc(this);
                }

                @Override // java.util.AbstractList, java.util.List
                public final ListIterator listIterator(int i) {
/* 3 */             return new zzhb(this, i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.zza.size();
                }

                @Override // com.google.android.gms.internal.auth.zzfe
                public final zzfe zze() {
/* 1 */             return this;
                }

                @Override // com.google.android.gms.internal.auth.zzfe
                public final List zzg() {
/* 3 */             return this.zza.zzg();
                }
            }
