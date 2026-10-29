            package com.google.android.gms.internal.auth;

            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhb implements ListIterator {
                final ListIterator zza;
                final /* synthetic */ int zzb;
                final /* synthetic */ zzhd zzc;

                public zzhb(zzhd zzhdVar, int i) {
/* 1 */             this.zzc = zzhdVar;
/* 3 */             this.zzb = i;
/* 16 */            this.zza = zzhdVar.zza.listIterator(i);
                }

                @Override // java.util.ListIterator
                public final /* synthetic */ void add(Object obj) {
/* 8 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zza.hasNext();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
/* 3 */             return this.zza.hasPrevious();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 7 */             return (String) this.zza.next();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 3 */             return this.zza.nextIndex();
                }

                @Override // java.util.ListIterator
                public final /* bridge */ /* synthetic */ Object previous() {
/* 7 */             return (String) this.zza.previous();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 3 */             return this.zza.previousIndex();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator
                public final /* synthetic */ void set(Object obj) {
/* 8 */             throw new UnsupportedOperationException();
                }
            }
