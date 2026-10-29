            package p000;

            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u13 implements Iterable, r21 {

                /* JADX INFO: renamed from: a */
                public int f17330a;

                /* JADX INFO: renamed from: b */
                public int f17331b;

                /* JADX INFO: renamed from: c */
                public final LinkedHashSet f17332c = new LinkedHashSet();

                /* JADX INFO: renamed from: a */
                public final boolean m8934a(int i) {
/* 7 */             return this.f17332c.contains(Integer.valueOf(i));
                }

                /* JADX INFO: renamed from: b */
                public final void m8935b(int i) {
/* 9 */             m8936c(C1839a.m6210b(Integer.valueOf(i)));
                }

                /* JADX INFO: renamed from: c */
                public final void m8936c(List list) {
/* 1 */             list.getClass();
/* 4 */             LinkedHashSet linkedHashSet = this.f17332c;
/* 6 */             linkedHashSet.addAll(list);
/* 10 */            this.f17330a = 0;
/* 16 */            Integer num = (Integer) CollectionsKt.m6182A(linkedHashSet);
/* 26 */            this.f17331b = num != null ? num.intValue() : 0;
/* 28 */            this.f17330a = 0;
                }

                public final void clear() {
/* 3 */             this.f17332c.clear();
                }

                /* JADX INFO: renamed from: d */
                public final void m8937d(int i) {
/* 9 */             m8938e(C1839a.m6210b(Integer.valueOf(i)));
                }

                /* JADX INFO: renamed from: e */
                public final void m8938e(List list) {
/* 1 */             list.getClass();
/* 4 */             Set setM6195N = CollectionsKt.m6195N(list);
/* 8 */             LinkedHashSet linkedHashSet = this.f17332c;
/* 10 */            linkedHashSet.removeAll(setM6195N);
/* 14 */            this.f17330a = 0;
/* 20 */            Integer num = (Integer) CollectionsKt.m6182A(linkedHashSet);
/* 28 */            this.f17331b = num != null ? num.intValue() : 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 4 */             obj.getClass();
/* 7 */             u13 u13Var = (u13) obj;
                    return this.f17332c.containsAll(u13Var.f17332c) && this.f17331b == u13Var.f17331b && this.f17330a == u13Var.f17330a;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new C2126r(this);
                }
            }
