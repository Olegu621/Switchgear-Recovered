            package p000;

            import java.util.AbstractList;
            import java.util.List;
            
            /* JADX INFO: renamed from: a0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC0002a0 extends AbstractList implements List, s21 {
                /* JADX INFO: renamed from: a */
                public abstract int mo0a();

                /* JADX INFO: renamed from: b */
                public abstract Object mo1b(int i);

                @Override // java.util.AbstractList, java.util.List
                public final /* bridge */ Object remove(int i) {
/* 1 */             return mo1b(i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ int size() {
/* 1 */             return mo0a();
                }
            }
