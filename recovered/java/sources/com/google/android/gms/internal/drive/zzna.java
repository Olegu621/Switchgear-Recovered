            package com.google.android.gms.internal.drive;

            import java.util.AbstractList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzna extends AbstractList<String> implements zzkz, RandomAccess {
                private final zzkz zzvt;

                public zzna(zzkz zzkzVar) {
/* 4 */             this.zzvt = zzkzVar;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 7 */             return (String) this.zzvt.get(i);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator<String> iterator() {
/* 3 */             return new zznc(this);
                }

                @Override // java.util.AbstractList, java.util.List
                public final ListIterator<String> listIterator(int i) {
/* 3 */             return new zznb(this, i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.zzvt.size();
                }

                @Override // com.google.android.gms.internal.drive.zzkz
                public final Object zzao(int i) {
/* 3 */             return this.zzvt.zzao(i);
                }

                @Override // com.google.android.gms.internal.drive.zzkz
                public final List<?> zzdr() {
/* 3 */             return this.zzvt.zzdr();
                }

                @Override // com.google.android.gms.internal.drive.zzkz
                public final zzkz zzds() {
/* 1 */             return this;
                }
            }
