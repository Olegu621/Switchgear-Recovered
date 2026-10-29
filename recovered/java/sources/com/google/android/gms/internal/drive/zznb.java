            package com.google.android.gms.internal.drive;

            import java.util.ListIterator;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznb implements ListIterator<String> {
                private ListIterator<String> zzvu;
                private final /* synthetic */ int zzvv;
                private final /* synthetic */ zzna zzvw;

                public zznb(zzna zznaVar, int i) {
/* 1 */             this.zzvw = zznaVar;
/* 3 */             this.zzvv = i;
/* 16 */            this.zzvu = zznaVar.zzvt.listIterator(i);
                }

                @Override // java.util.ListIterator
                public final /* synthetic */ void add(String str) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zzvu.hasNext();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
/* 3 */             return this.zzvu.hasPrevious();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final /* synthetic */ Object next() {
/* 3 */             return this.zzvu.next();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 3 */             return this.zzvu.nextIndex();
                }

                @Override // java.util.ListIterator
                public final /* synthetic */ String previous() {
/* 3 */             return this.zzvu.previous();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 3 */             return this.zzvu.previousIndex();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator
                public final /* synthetic */ void set(String str) {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
