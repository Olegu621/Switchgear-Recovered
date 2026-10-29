            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class nw2 implements Collection, r21 {

                /* JADX INFO: renamed from: a */
                public final int[] f14553a;

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

                /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
/* 4 */             if (!(obj instanceof mw2)) {
/* 3 */                 return false;
                    }
/* 9 */             int i = ((mw2) obj).f14055a;
/* 11 */            int[] iArr = this.f14553a;
/* 13 */            int length = iArr.length;
/* 14 */            int i2 = 0;
/* 15 */            while (i2 < length) {
/* 19 */                if (i == iArr[i2]) {
/* 26 */                    if (i2 >= 0) {
/* 28 */                        return true;
                            }
/* 3 */                     return false;
                        }
/* 22 */                i2++;
                    }
/* 25 */            i2 = -1;
/* 26 */            if (i2 >= 0) {
/* 28 */                return true;
                    }
/* 3 */             return false;
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 8 */             if (collection.isEmpty()) {
/* 53 */                return true;
                    }
/* 19 */            for (Object obj : collection) {
/* 28 */                if (obj instanceof mw2) {
/* 32 */                    int i = ((mw2) obj).f14055a;
/* 34 */                    int[] iArr = this.f14553a;
/* 36 */                    int length = iArr.length;
/* 37 */                    int i2 = 0;
                            while (true) {
/* 38 */                        if (i2 >= length) {
/* 48 */                            i2 = -1;
                                    break;
                                }
/* 42 */                        if (i == iArr[i2]) {
                                    break;
                                }
/* 45 */                        i2++;
                            }
/* 49 */                    if (i2 >= 0) {
                            }
                        }
/* 27 */                return false;
                    }
/* 53 */            return true;
                }

                @Override // java.util.Collection
                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof nw2) {
                        return this.f14553a.equals(((nw2) obj).f14553a);
                    }
/* 18 */            return false;
                }

                @Override // java.util.Collection
                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.f14553a);
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return this.f14553a.length == 0;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 6 */             return new C2126r(this.f14553a, 4);
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
/* 3 */             return this.f14553a.length;
                }

                @Override // java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             return k50.m5955I(this, objArr);
                }

                public final String toString() {
/* 22 */            return "UIntArray(storage=" + Arrays.toString(this.f14553a) + ')';
                }

                @Override // java.util.Collection
/* 8 */         public final Object[] toArray() {
/* 9 */             return k50.m5954H(this);
                }
            }
