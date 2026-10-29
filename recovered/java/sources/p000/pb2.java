            package p000;

            import java.io.InvalidObjectException;
            import java.io.NotSerializableException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 10 */    public final class pb2 extends AbstractC0163b0 implements Set, Serializable {

                /* JADX INFO: renamed from: b */
                private static final ob2 f15053b = new ob2(null);

                /* JADX INFO: renamed from: c */
                public static final pb2 f15054c;

                /* JADX INFO: renamed from: a */
                public final sb1 f15055a;

                static {
/* 13 */            sb1.f16491Y.getClass();
/* 21 */            f15054c = new pb2(sb1.f16492Z);
                }

                public pb2() {
/* 9 */             this.f15055a = new sb1();
                }

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() throws NotSerializableException {
/* 5 */             if (this.f15055a.f16496X) {
/* 10 */                return new ja2(1, this);
                    }
/* 21 */            throw new NotSerializableException("The set cannot be serialized while it is being built.");
                }

                @Override // p000.AbstractC0163b0
                /* JADX INFO: renamed from: a */
                public final int mo1187a() {
/* 3 */             return this.f15055a.f16505w;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean add(Object obj) {
                    return this.f15055a.m8461a(obj) >= 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean addAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f15055a.m8462b();
/* 9 */             return super.addAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
/* 3 */             this.f15055a.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 3 */             return this.f15055a.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
/* 3 */             return this.f15055a.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 1 */             sb1 sb1Var = this.f15055a;
/* 3 */             sb1Var.getClass();
/* 9 */             return new pb1(sb1Var, 1);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
/* 1 */             sb1 sb1Var = this.f15055a;
/* 3 */             sb1Var.m8462b();
/* 6 */             int iM8466f = sb1Var.m8466f(obj);
/* 10 */            if (iM8466f < 0) {
/* 12 */                return false;
                    }
/* 14 */            sb1Var.m8470j(iM8466f);
/* 17 */            return true;
                }

                @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f15055a.m8462b();
/* 9 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f15055a.m8462b();
/* 9 */             return super.retainAll(collection);
                }

/* 11 */        public pb2(sb1 sb1Var) {
                    sb1Var.getClass();
/* 13 */            this.f15055a = sb1Var;
                }

/* 13 */        public pb2(int i) {
/* 16 */            this.f15055a = new sb1(i);
                }
            }
