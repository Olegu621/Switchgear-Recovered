            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class tw2 implements Collection, r21 {

                /* JADX INFO: renamed from: a */
                public final long[] f17296a;

                @Override // java.util.Collection
                public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean addAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
/* 4 */             if (!(obj instanceof sw2)) {
/* 3 */                 return false;
                    }
/* 9 */             long j = ((sw2) obj).f16830a;
/* 11 */            long[] jArr = this.f17296a;
/* 13 */            int length = jArr.length;
/* 14 */            int i = 0;
/* 15 */            while (i < length) {
/* 21 */                if (j == jArr[i]) {
/* 28 */                    if (i >= 0) {
/* 30 */                        return true;
                            }
/* 3 */                     return false;
                        }
/* 24 */                i++;
                    }
/* 27 */            i = -1;
/* 28 */            if (i >= 0) {
/* 30 */                return true;
                    }
/* 3 */             return false;
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 8 */             if (collection.isEmpty()) {
/* 55 */                return true;
                    }
/* 19 */            for (Object obj : collection) {
/* 28 */                if (obj instanceof sw2) {
/* 32 */                    long j = ((sw2) obj).f16830a;
/* 34 */                    long[] jArr = this.f17296a;
/* 36 */                    int length = jArr.length;
/* 37 */                    int i = 0;
                            while (true) {
/* 38 */                        if (i >= length) {
/* 50 */                            i = -1;
                                    break;
                                }
/* 44 */                        if (j == jArr[i]) {
                                    break;
                                }
/* 47 */                        i++;
                            }
/* 51 */                    if (i >= 0) {
                            }
                        }
/* 27 */                return false;
                    }
/* 55 */            return true;
                }

                @Override // java.util.Collection
                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof tw2) {
                        return this.f17296a.equals(((tw2) obj).f17296a);
                    }
/* 18 */            return false;
                }

                @Override // java.util.Collection
                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.f17296a);
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return this.f17296a.length == 0;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 6 */             return new C2126r(this.f17296a, 5);
                }

                @Override // java.util.Collection
                public final boolean remove(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final int size() {
/* 3 */             return this.f17296a.length;
                }

                @Override // java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             return k50.m5955I(this, objArr);
                }

                public final String toString() {
/* 22 */            return "ULongArray(storage=" + Arrays.toString(this.f17296a) + ')';
                }

                @Override // java.util.Collection
/* 8 */         public final Object[] toArray() {
/* 9 */             return k50.m5954H(this);
                }
            }
