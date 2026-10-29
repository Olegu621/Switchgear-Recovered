            package io.sentry;

            import java.io.IOException;
            import java.io.ObjectInputStream;
            import java.io.ObjectOutputStream;
            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import java.util.Queue;
            import p000.C1951n4;
            
            /* JADX INFO: renamed from: io.sentry.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1464h extends AbstractCollection implements Queue, Serializable {

                /* JADX INFO: renamed from: a */
                public transient Object[] f10965a;

                /* JADX INFO: renamed from: b */
                public transient int f10966b = 0;

                /* JADX INFO: renamed from: c */
                public transient int f10967c = 0;

                /* JADX INFO: renamed from: d */
                public transient boolean f10968d = false;

                /* JADX INFO: renamed from: e */
                public final int f10969e;

                public C1464h(int i) {
/* 11 */            if (i <= 0) {
/* 23 */                C1951n4.m6859j("The size must be greater than 0");
/* 27 */                throw null;
                    }
/* 13 */            Object[] objArr = new Object[i];
/* 15 */            this.f10965a = objArr;
/* 18 */            this.f10969e = objArr.length;
                }

                private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
/* 1 */             objectInputStream.defaultReadObject();
/* 4 */             int i = this.f10969e;
/* 8 */             this.f10965a = new Object[i];
/* 10 */            int i2 = objectInputStream.readInt();
/* 16 */            for (int i3 = 0; i3 < i2; i3++) {
/* 24 */                this.f10965a[i3] = objectInputStream.readObject();
                    }
/* 29 */            this.f10966b = 0;
/* 35 */            boolean z = i2 == i;
/* 36 */            this.f10968d = z;
/* 38 */            if (z) {
/* 40 */                this.f10967c = 0;
                    } else {
/* 43 */                this.f10967c = i2;
                    }
                }

                private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
/* 1 */             objectOutputStream.defaultWriteObject();
/* 8 */             objectOutputStream.writeInt(size());
/* 13 */            C1455g c1455g = new C1455g(this);
/* 20 */            while (c1455g.hasNext()) {
/* 26 */                objectOutputStream.writeObject(c1455g.next());
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
                public final boolean add(Object obj) {
/* 1 */             if (obj == null) {
/* 41 */                C1951n4.m6868s("Attempted to add null object to queue");
/* 44 */                return false;
                    }
/* 3 */             int size = size();
/* 7 */             int i = this.f10969e;
/* 9 */             if (size == i) {
/* 11 */                remove();
                    }
/* 14 */            Object[] objArr = this.f10965a;
/* 16 */            int i2 = this.f10967c;
/* 18 */            int i3 = i2 + 1;
/* 20 */            this.f10967c = i3;
/* 22 */            objArr[i2] = obj;
/* 24 */            if (i3 >= i) {
/* 27 */                this.f10967c = 0;
                    }
/* 34 */            if (this.f10967c == this.f10966b) {
/* 36 */                this.f10968d = true;
                    }
/* 33 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
/* 2 */             this.f10968d = false;
/* 4 */             this.f10966b = 0;
/* 6 */             this.f10967c = 0;
/* 11 */            Arrays.fill(this.f10965a, (Object) null);
                }

                @Override // java.util.Queue
                public final Object element() {
/* 5 */             if (isEmpty()) {
/* 19 */                throw new NoSuchElementException("queue is empty");
                    }
/* 7 */             return peek();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new C1455g(this);
                }

                @Override // java.util.Queue
                public final boolean offer(Object obj) {
/* 1 */             add(obj);
/* 4 */             return true;
                }

                @Override // java.util.Queue
                public final Object peek() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return null;
                    }
/* 13 */            return this.f10965a[this.f10966b];
                }

                @Override // java.util.Queue
                public final Object poll() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return null;
                    }
/* 9 */             return remove();
                }

                @Override // java.util.Queue
                public final Object remove() {
/* 5 */             if (isEmpty()) {
/* 39 */                throw new NoSuchElementException("queue is empty");
                    }
/* 7 */             Object[] objArr = this.f10965a;
/* 9 */             int i = this.f10966b;
/* 11 */            Object obj = objArr[i];
/* 13 */            if (obj != null) {
/* 15 */                int i2 = i + 1;
/* 17 */                this.f10966b = i2;
/* 20 */                objArr[i] = null;
/* 25 */                if (i2 >= this.f10969e) {
/* 27 */                    this.f10966b = 0;
                        }
/* 29 */                this.f10968d = false;
                    }
/* 31 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final int size() {
/* 1 */             int i = this.f10967c;
/* 3 */             int i2 = this.f10966b;
/* 5 */             int i3 = this.f10969e;
/* 7 */             if (i < i2) {
/* 10 */                return (i3 - i2) + i;
                    }
/* 12 */            if (i != i2) {
/* 21 */                return i - i2;
                    }
/* 16 */            if (this.f10968d) {
/* 18 */                return i3;
                    }
/* 19 */            return 0;
                }
            }
