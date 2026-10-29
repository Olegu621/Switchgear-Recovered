            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class tb1 extends AbstractC2275v {

                /* JADX INFO: renamed from: a */
                public final sb1 f17026a;

                public tb1(sb1 sb1Var) {
/* 4 */             this.f17026a = sb1Var;
                }

                @Override // p000.AbstractC0163b0
                /* JADX INFO: renamed from: a */
                public final int mo1187a() {
/* 3 */             return this.f17026a.f16505w;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean add(Object obj) {
/* 3 */             ((Map.Entry) obj).getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean addAll(Collection collection) {
/* 1 */             collection.getClass();
/* 9 */             throw new UnsupportedOperationException();
                }

                @Override // p000.AbstractC2275v
                /* JADX INFO: renamed from: b */
                public final boolean mo8772b(Map.Entry entry) {
/* 1 */             entry.getClass();
/* 4 */             sb1 sb1Var = this.f17026a;
/* 6 */             sb1Var.getClass();
/* 13 */            int iM8466f = sb1Var.m8466f(entry.getKey());
/* 17 */            if (iM8466f < 0) {
/* 19 */                return false;
                    }
/* 21 */            Object[] objArr = sb1Var.f16498b;
/* 23 */            objArr.getClass();
/* 32 */            return Intrinsics.m6216a(objArr[iM8466f], entry.getValue());
                }

                @Override // p000.AbstractC2275v
                /* JADX INFO: renamed from: c */
                public final boolean mo8773c(Map.Entry entry) {
/* 1 */             entry.getClass();
/* 4 */             sb1 sb1Var = this.f17026a;
/* 6 */             sb1Var.getClass();
/* 9 */             entry.getClass();
/* 12 */            sb1Var.m8462b();
/* 19 */            int iM8466f = sb1Var.m8466f(entry.getKey());
/* 23 */            if (iM8466f < 0) {
/* 43 */                return false;
                    }
/* 26 */            Object[] objArr = sb1Var.f16498b;
/* 28 */            objArr.getClass();
/* 41 */            if (!Intrinsics.m6216a(objArr[iM8466f], entry.getValue())) {
/* 43 */                return false;
                    }
/* 45 */            sb1Var.m8470j(iM8466f);
/* 48 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
/* 3 */             this.f17026a.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             return this.f17026a.m8464d(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
/* 3 */             return this.f17026a.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 1 */             sb1 sb1Var = this.f17026a;
/* 3 */             sb1Var.getClass();
/* 9 */             return new pb1(sb1Var, 0);
                }

                @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f17026a.m8462b();
/* 9 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f17026a.m8462b();
/* 9 */             return super.retainAll(collection);
                }
            }
