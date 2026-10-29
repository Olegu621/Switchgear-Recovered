            package p000;

            import java.util.AbstractList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oq3 extends AbstractList implements RandomAccess, ap3 {

                /* JADX INFO: renamed from: a */
                public final zo3 f14867a;

                public oq3(zo3 zo3Var) {
/* 4 */             this.f14867a = zo3Var;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object get(int i) {
/* 3 */             return this.f14867a.get(i);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator iterator() {
/* 3 */             return new yx2(this);
                }

                @Override // java.util.AbstractList, java.util.List
                public final ListIterator listIterator(int i) {
/* 3 */             return new xx2(this, i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 5 */             return this.f14867a.f20285b.size();
                }

                @Override // p000.ap3
                public final Object zzg(int i) {
/* 5 */             return this.f14867a.f20285b.get(i);
                }

                @Override // p000.ap3
                public final List zzh() {
/* 5 */             return Collections.unmodifiableList(this.f14867a.f20285b);
                }

                @Override // p000.ap3
                public final ap3 zzi() {
/* 1 */             return this;
                }
            }
