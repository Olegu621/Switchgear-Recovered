            package p000;

            import java.lang.reflect.Array;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: dd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 77 */    public final class C0840dd extends AbstractC0002a0 {

                /* JADX INFO: renamed from: d */
                public static final C0212cd f7119d = new C0212cd(null);

                /* JADX INFO: renamed from: e */
                public static final Object[] f7120e = new Object[0];

                /* JADX INFO: renamed from: a */
                public int f7121a;

                /* JADX INFO: renamed from: b */
                public Object[] f7122b = f7120e;

                /* JADX INFO: renamed from: c */
                public int f7123c;

                @Override // p000.AbstractC0002a0
                /* JADX INFO: renamed from: a */
                public final int mo0a() {
/* 1 */             return this.f7123c;
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
                    int length;
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i2 = this.f7123c;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7639b(i, i2);
/* 13 */            if (i == this.f7123c) {
/* 15 */                addLast(obj);
/* 18 */                return;
                    }
/* 19 */            if (i == 0) {
/* 21 */                addFirst(obj);
/* 24 */                return;
                    }
/* 25 */            m3002i();
/* 32 */            m2997d(this.f7123c + 1);
/* 38 */            int iM3001h = m3001h(this.f7121a + i);
/* 42 */            int i3 = this.f7123c;
/* 48 */            if (i < ((i3 + 1) >> 1)) {
/* 50 */                if (iM3001h == 0) {
/* 52 */                    Object[] objArr = this.f7122b;
/* 54 */                    objArr.getClass();
/* 58 */                    length = objArr.length - 1;
                        } else {
/* 60 */                    length = iM3001h - 1;
                        }
/* 62 */                int length2 = this.f7121a;
/* 64 */                if (length2 == 0) {
/* 66 */                    Object[] objArr2 = this.f7122b;
/* 68 */                    objArr2.getClass();
/* 71 */                    length2 = objArr2.length;
                        }
/* 72 */                int i4 = length2 - 1;
/* 73 */                int i5 = this.f7121a;
/* 75 */                Object[] objArr3 = this.f7122b;
/* 77 */                if (length >= i5) {
/* 81 */                    objArr3[i4] = objArr3[i5];
/* 87 */                    C1960nd.m6965c(objArr3, i5, objArr3, i5 + 1, length + 1);
                        } else {
/* 94 */                    C1960nd.m6965c(objArr3, i5 - 1, objArr3, i5, objArr3.length);
/* 97 */                    Object[] objArr4 = this.f7122b;
/* 103 */                   objArr4[objArr4.length - 1] = objArr4[0];
/* 107 */                   C1960nd.m6965c(objArr4, 0, objArr4, 1, length + 1);
                        }
/* 112 */               this.f7122b[length] = obj;
/* 114 */               this.f7121a = i4;
                    } else {
/* 120 */               int iM3001h2 = m3001h(i3 + this.f7121a);
/* 124 */               Object[] objArr5 = this.f7122b;
/* 126 */               if (iM3001h < iM3001h2) {
/* 130 */                   C1960nd.m6965c(objArr5, iM3001h + 1, objArr5, iM3001h, iM3001h2);
                        } else {
/* 134 */                   C1960nd.m6965c(objArr5, 1, objArr5, 0, iM3001h2);
/* 137 */                   Object[] objArr6 = this.f7122b;
/* 143 */                   objArr6[0] = objArr6[objArr6.length - 1];
/* 149 */                   C1960nd.m6965c(objArr6, iM3001h + 1, objArr6, iM3001h, objArr6.length - 1);
                        }
/* 154 */               this.f7122b[iM3001h] = obj;
                    }
/* 159 */           this.f7123c++;
                }

                @Override // java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             C2089q c2089q = AbstractC2237u.Companion;
/* 6 */             int i2 = this.f7123c;
/* 8 */             c2089q.getClass();
/* 11 */            C2089q.m7639b(i, i2);
/* 19 */            if (collection.isEmpty()) {
/* 18 */                return false;
                    }
/* 24 */            if (i == this.f7123c) {
/* 26 */                return addAll(collection);
                    }
/* 31 */            m3002i();
/* 41 */            m2997d(collection.size() + this.f7123c);
/* 49 */            int iM3001h = m3001h(this.f7123c + this.f7121a);
/* 56 */            int iM3001h2 = m3001h(this.f7121a + i);
/* 60 */            int size = collection.size();
/* 69 */            if (i >= ((this.f7123c + 1) >> 1)) {
/* 146 */               int i3 = iM3001h2 + size;
/* 148 */               Object[] objArr = this.f7122b;
/* 150 */               if (iM3001h2 < iM3001h) {
/* 152 */                   int i4 = size + iM3001h;
/* 154 */                   if (i4 <= objArr.length) {
/* 156 */                       C1960nd.m6965c(objArr, i3, objArr, iM3001h2, iM3001h);
                            } else if (i3 >= objArr.length) {
/* 165 */                       C1960nd.m6965c(objArr, i3 - objArr.length, objArr, iM3001h2, iM3001h);
                            } else {
/* 171 */                       int length = iM3001h - (i4 - objArr.length);
/* 173 */                       C1960nd.m6965c(objArr, 0, objArr, length, iM3001h);
/* 176 */                       Object[] objArr2 = this.f7122b;
/* 178 */                       C1960nd.m6965c(objArr2, i3, objArr2, iM3001h2, length);
                            }
                        } else {
/* 182 */                   C1960nd.m6965c(objArr, size, objArr, 0, iM3001h);
/* 185 */                   Object[] objArr3 = this.f7122b;
/* 188 */                   if (i3 >= objArr3.length) {
/* 193 */                       C1960nd.m6965c(objArr3, i3 - objArr3.length, objArr3, iM3001h2, objArr3.length);
                            } else {
/* 200 */                       C1960nd.m6965c(objArr3, 0, objArr3, objArr3.length - size, objArr3.length);
/* 203 */                       Object[] objArr4 = this.f7122b;
/* 207 */                       C1960nd.m6965c(objArr4, i3, objArr4, iM3001h2, objArr4.length - size);
                            }
                        }
/* 210 */               m2996c(iM3001h2, collection);
/* 66 */                return true;
                    }
/* 71 */            int i5 = this.f7121a;
/* 73 */            int length2 = i5 - size;
/* 75 */            Object[] objArr5 = this.f7122b;
/* 77 */            if (iM3001h2 < i5) {
/* 112 */               C1960nd.m6965c(objArr5, length2, objArr5, i5, objArr5.length);
/* 115 */               Object[] objArr6 = this.f7122b;
/* 117 */               if (size >= iM3001h2) {
/* 121 */                   C1960nd.m6965c(objArr6, objArr6.length - size, objArr6, 0, iM3001h2);
                        } else {
/* 127 */                   C1960nd.m6965c(objArr6, objArr6.length - size, objArr6, 0, size);
/* 130 */                   Object[] objArr7 = this.f7122b;
/* 132 */                   C1960nd.m6965c(objArr7, 0, objArr7, size, iM3001h2);
                        }
                    } else if (length2 >= 0) {
/* 81 */                C1960nd.m6965c(objArr5, length2, objArr5, i5, iM3001h2);
                    } else {
/* 86 */                length2 += objArr5.length;
/* 87 */                int i6 = iM3001h2 - i5;
/* 90 */                int length3 = objArr5.length - length2;
/* 91 */                if (length3 >= i6) {
/* 93 */                    C1960nd.m6965c(objArr5, length2, objArr5, i5, iM3001h2);
                        } else {
/* 99 */                    C1960nd.m6965c(objArr5, length2, objArr5, i5, i5 + length3);
/* 102 */                   Object[] objArr8 = this.f7122b;
/* 107 */                   C1960nd.m6965c(objArr8, 0, objArr8, this.f7121a + length3, iM3001h2);
                        }
                    }
/* 135 */           this.f7121a = length2;
/* 142 */           m2996c(m2999f(iM3001h2 - size), collection);
/* 66 */            return true;
                }

                public final void addFirst(Object obj) {
/* 1 */             m3002i();
/* 8 */             m2997d(this.f7123c + 1);
/* 11 */            int length = this.f7121a;
/* 13 */            if (length == 0) {
/* 15 */                Object[] objArr = this.f7122b;
/* 17 */                objArr.getClass();
/* 20 */                length = objArr.length;
                    }
/* 21 */            int i = length - 1;
/* 23 */            this.f7121a = i;
/* 27 */            this.f7122b[i] = obj;
/* 33 */            this.f7123c++;
                }

                public final void addLast(Object obj) {
/* 1 */             m3002i();
/* 10 */            m2997d(mo0a() + 1);
/* 26 */            this.f7122b[m3001h(mo0a() + this.f7121a)] = obj;
/* 34 */            this.f7123c = mo0a() + 1;
                }

                @Override // p000.AbstractC0002a0
                /* JADX INFO: renamed from: b */
                public final Object mo1b(int i) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i2 = this.f7123c;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7638a(i, i2);
/* 17 */            if (i == mo0a() - 1) {
/* 19 */                return removeLast();
                    }
/* 24 */            if (i == 0) {
/* 26 */                return removeFirst();
                    }
/* 31 */            m3002i();
/* 37 */            int iM3001h = m3001h(this.f7121a + i);
/* 41 */            Object[] objArr = this.f7122b;
/* 43 */            Object obj = objArr[iM3001h];
/* 47 */            int i3 = this.f7123c >> 1;
/* 48 */            int i4 = this.f7121a;
/* 52 */            if (i < i3) {
/* 54 */                if (iM3001h >= i4) {
/* 58 */                    C1960nd.m6965c(objArr, i4 + 1, objArr, i4, iM3001h);
                        } else {
/* 62 */                    C1960nd.m6965c(objArr, 1, objArr, 0, iM3001h);
/* 65 */                    Object[] objArr2 = this.f7122b;
/* 71 */                    objArr2[0] = objArr2[objArr2.length - 1];
/* 73 */                    int i5 = this.f7121a;
/* 79 */                    C1960nd.m6965c(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
                        }
/* 82 */                Object[] objArr3 = this.f7122b;
/* 84 */                int i6 = this.f7121a;
/* 86 */                objArr3[i6] = null;
/* 92 */                this.f7121a = m2998e(i6);
                    } else {
/* 101 */               int iM3001h2 = m3001h((mo0a() - 1) + i4);
/* 105 */               Object[] objArr4 = this.f7122b;
/* 107 */               if (iM3001h <= iM3001h2) {
/* 113 */                   C1960nd.m6965c(objArr4, iM3001h, objArr4, iM3001h + 1, iM3001h2 + 1);
                        } else {
/* 120 */                   C1960nd.m6965c(objArr4, iM3001h, objArr4, iM3001h + 1, objArr4.length);
/* 123 */                   Object[] objArr5 = this.f7122b;
/* 129 */                   objArr5[objArr5.length - 1] = objArr5[0];
/* 133 */                   C1960nd.m6965c(objArr5, 0, objArr5, 1, iM3001h2 + 1);
                        }
/* 138 */               this.f7122b[iM3001h2] = null;
                    }
/* 143 */           this.f7123c--;
/* 145 */           return obj;
                }

                /* JADX INFO: renamed from: c */
                public final void m2996c(int i, Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 7 */             int length = this.f7122b.length;
/* 8 */             while (i < length && it.hasNext()) {
/* 22 */                this.f7122b[i] = it.next();
/* 24 */                i++;
                    }
/* 27 */            int i2 = this.f7121a;
/* 30 */            for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
/* 44 */                this.f7122b[i3] = it.next();
                    }
/* 56 */            this.f7123c = collection.size() + this.f7123c;
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 5 */             if (!isEmpty()) {
/* 7 */                 m3002i();
/* 23 */                m3000g(this.f7121a, m3001h(mo0a() + this.f7121a));
                    }
/* 27 */            this.f7121a = 0;
/* 29 */            this.f7123c = 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                /* JADX INFO: renamed from: d */
                public final void m2997d(int i) {
/* 1 */             if (i < 0) {
/* 60 */                f42.m3656l("Deque is too big.");
/* 63 */                return;
                    }
/* 3 */             Object[] objArr = this.f7122b;
/* 6 */             if (i <= objArr.length) {
/* 8 */                 return;
                    }
/* 11 */            if (objArr == f7120e) {
/* 15 */                if (i < 10) {
/* 17 */                    i = 10;
                        }
/* 20 */                this.f7122b = new Object[i];
/* 22 */                return;
                    }
/* 23 */            C2089q c2089q = AbstractC2237u.Companion;
/* 25 */            int length = objArr.length;
/* 26 */            c2089q.getClass();
/* 33 */            Object[] objArr2 = new Object[C2089q.m7641d(length, i)];
/* 35 */            Object[] objArr3 = this.f7122b;
/* 41 */            C1960nd.m6965c(objArr3, 0, objArr2, this.f7121a, objArr3.length);
/* 44 */            Object[] objArr4 = this.f7122b;
/* 46 */            int length2 = objArr4.length;
/* 47 */            int i2 = this.f7121a;
/* 50 */            C1960nd.m6965c(objArr4, length2 - i2, objArr2, 0, i2);
/* 53 */            this.f7121a = 0;
/* 55 */            this.f7122b = objArr2;
                }

                /* JADX INFO: renamed from: e */
                public final int m2998e(int i) {
/* 1 */             Object[] objArr = this.f7122b;
/* 3 */             objArr.getClass();
/* 9 */             if (i == objArr.length - 1) {
/* 11 */                return 0;
                    }
/* 13 */            return i + 1;
                }

                /* JADX INFO: renamed from: f */
                public final int m2999f(int i) {
                    return i < 0 ? i + this.f7122b.length : i;
                }

                /* JADX INFO: renamed from: g */
                public final void m3000g(int i, int i2) {
/* 1 */             Object[] objArr = this.f7122b;
/* 3 */             if (i < i2) {
/* 5 */                 C1960nd.m6968f(objArr, i, i2);
                    } else {
/* 11 */                Arrays.fill(objArr, i, objArr.length, (Object) null);
/* 17 */                C1960nd.m6968f(this.f7122b, 0, i2);
                    }
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i2 = this.f7123c;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7638a(i, i2);
/* 20 */            return this.f7122b[m3001h(this.f7121a + i)];
                }

                /* JADX INFO: renamed from: h */
                public final int m3001h(int i) {
/* 1 */             Object[] objArr = this.f7122b;
                    return i >= objArr.length ? i - objArr.length : i;
                }

                /* JADX INFO: renamed from: i */
                public final void m3002i() {
/* 5 */             ((AbstractList) this).modCount++;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
                    int i;
/* 8 */             int iM3001h = m3001h(mo0a() + this.f7121a);
/* 12 */            int length = this.f7121a;
/* 14 */            if (length < iM3001h) {
/* 16 */                while (length < iM3001h) {
/* 26 */                    if (Intrinsics.m6216a(obj, this.f7122b[length])) {
/* 28 */                        i = this.f7121a;
                            } else {
/* 32 */                        length++;
                            }
                        }
/* 81 */                return -1;
                    }
/* 35 */            if (length < iM3001h) {
/* 81 */                return -1;
                    }
/* 39 */            int length2 = this.f7122b.length;
/* 40 */            while (length < length2) {
/* 50 */                if (Intrinsics.m6216a(obj, this.f7122b[length])) {
/* 52 */                    i = this.f7121a;
                        } else {
/* 55 */                    length++;
                        }
                    }
/* 59 */            for (int i2 = 0; i2 < iM3001h; i2++) {
/* 69 */                if (Intrinsics.m6216a(obj, this.f7122b[i2])) {
/* 74 */                    length = i2 + this.f7122b.length;
/* 75 */                    i = this.f7121a;
                        }
                    }
/* 81 */            return -1;
/* 30 */            return length - i;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean isEmpty() {
                    return mo0a() == 0;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int lastIndexOf(Object obj) {
                    Object[] objArr;
                    int length;
                    int i;
/* 6 */             int iM3001h = m3001h(this.f7123c + this.f7121a);
/* 10 */            int i2 = this.f7121a;
/* 13 */            if (i2 < iM3001h) {
/* 15 */                length = iM3001h - 1;
/* 17 */                if (i2 <= length) {
/* 27 */                    while (!Intrinsics.m6216a(obj, this.f7122b[length])) {
/* 33 */                        if (length != i2) {
/* 35 */                            length--;
                                }
                            }
/* 29 */                    i = this.f7121a;
/* 31 */                    return length - i;
                        }
/* 12 */                return -1;
                    }
/* 38 */            if (i2 > iM3001h) {
/* 52 */                do {
/* 40 */                    iM3001h--;
/* 42 */                    objArr = this.f7122b;
/* 44 */                    if (-1 >= iM3001h) {
/* 64 */                        objArr.getClass();
/* 68 */                        length = objArr.length - 1;
/* 70 */                        int i3 = this.f7121a;
/* 72 */                        if (i3 <= length) {
/* 82 */                            while (!Intrinsics.m6216a(obj, this.f7122b[length])) {
/* 87 */                                if (length != i3) {
/* 89 */                                    length--;
                                        }
                                    }
/* 84 */                            i = this.f7121a;
                                }
                            }
/* 31 */                    return length - i;
/* 52 */                } while (!Intrinsics.m6216a(obj, objArr[iM3001h]));
/* 57 */                length = iM3001h + this.f7122b.length;
/* 58 */                i = this.f7121a;
/* 31 */                return length - i;
                    }
/* 12 */            return -1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             int iIndexOf = indexOf(obj);
/* 6 */             if (iIndexOf == -1) {
/* 8 */                 return false;
                    }
/* 10 */            mo1b(iIndexOf);
/* 13 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean removeAll(Collection collection) {
                    int iM3001h;
                    Object[] objArr;
/* 1 */             collection.getClass();
/* 8 */             boolean z = false;
/* 8 */             z = false;
/* 8 */             z = false;
/* 9 */             if (!isEmpty() && this.f7122b.length != 0) {
/* 23 */                int iM3001h2 = m3001h(this.f7123c + this.f7121a);
/* 27 */                int i = this.f7121a;
/* 30 */                if (i < iM3001h2) {
/* 32 */                    iM3001h = i;
                            while (true) {
/* 33 */                        objArr = this.f7122b;
/* 35 */                        if (i >= iM3001h2) {
                                    break;
                                }
/* 37 */                        Object obj = objArr[i];
/* 43 */                        if (collection.contains(obj)) {
/* 53 */                            z = true;
                                } else {
/* 49 */                            this.f7122b[iM3001h] = obj;
/* 47 */                            iM3001h++;
                                }
/* 54 */                        i++;
                            }
/* 57 */                    C1960nd.m6968f(objArr, iM3001h, iM3001h2);
                        } else {
/* 63 */                    int length = this.f7122b.length;
/* 64 */                    boolean z2 = false;
/* 65 */                    int i2 = i;
/* 67 */                    while (i < length) {
/* 69 */                        Object[] objArr2 = this.f7122b;
/* 71 */                        Object obj2 = objArr2[i];
/* 73 */                        objArr2[i] = null;
/* 79 */                        if (collection.contains(obj2)) {
/* 89 */                            z2 = true;
                                } else {
/* 85 */                            this.f7122b[i2] = obj2;
/* 83 */                            i2++;
                                }
/* 90 */                        i++;
                            }
/* 93 */                    iM3001h = m3001h(i2);
/* 98 */                    for (int i3 = 0; i3 < iM3001h2; i3++) {
/* 100 */                       Object[] objArr3 = this.f7122b;
/* 102 */                       Object obj3 = objArr3[i3];
/* 104 */                       objArr3[i3] = null;
/* 110 */                       if (collection.contains(obj3)) {
/* 121 */                           z2 = true;
                                } else {
/* 114 */                           this.f7122b[iM3001h] = obj3;
/* 116 */                           iM3001h = m2998e(iM3001h);
                                }
                            }
/* 125 */                   z = z2;
                        }
/* 126 */               if (z) {
/* 128 */                   m3002i();
/* 138 */                   this.f7123c = m2999f(iM3001h - this.f7121a);
                        }
                    }
/* 140 */           return z;
                }

                public final Object removeFirst() {
/* 5 */             if (isEmpty()) {
/* 41 */                throw new NoSuchElementException("ArrayDeque is empty.");
                    }
/* 7 */             m3002i();
/* 10 */            Object[] objArr = this.f7122b;
/* 12 */            int i = this.f7121a;
/* 14 */            Object obj = objArr[i];
/* 17 */            objArr[i] = null;
/* 23 */            this.f7121a = m2998e(i);
/* 31 */            this.f7123c = mo0a() - 1;
/* 33 */            return obj;
                }

                public final Object removeLast() {
/* 5 */             if (isEmpty()) {
/* 46 */                throw new NoSuchElementException("ArrayDeque is empty.");
                    }
/* 7 */             m3002i();
/* 19 */            int iM3001h = m3001h((size() - 1) + this.f7121a);
/* 23 */            Object[] objArr = this.f7122b;
/* 25 */            Object obj = objArr[iM3001h];
/* 28 */            objArr[iM3001h] = null;
/* 36 */            this.f7123c = mo0a() - 1;
/* 38 */            return obj;
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i3 = this.f7123c;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7640c(i, i2, i3);
/* 11 */            int i4 = i2 - i;
/* 13 */            if (i4 == 0) {
/* 15 */                return;
                    }
/* 18 */            if (i4 == this.f7123c) {
/* 20 */                clear();
/* 23 */                return;
                    }
/* 25 */            if (i4 == 1) {
/* 27 */                mo1b(i);
/* 30 */                return;
                    }
/* 31 */            m3002i();
/* 36 */            int i5 = this.f7123c - i2;
/* 37 */            int i6 = this.f7121a;
/* 39 */            if (i < i5) {
/* 44 */                int iM3001h = m3001h((i - 1) + i6);
/* 52 */                int iM3001h2 = m3001h(this.f7121a + (i2 - 1));
/* 56 */                while (i > 0) {
/* 58 */                    int i7 = iM3001h + 1;
/* 66 */                    int iMin = Math.min(i, Math.min(i7, iM3001h2 + 1));
/* 70 */                    Object[] objArr = this.f7122b;
/* 72 */                    int i8 = iM3001h2 - iMin;
/* 75 */                    int i9 = iM3001h - iMin;
/* 78 */                    C1960nd.m6965c(objArr, i8 + 1, objArr, i9 + 1, i7);
/* 81 */                    iM3001h = m2999f(i9);
/* 85 */                    iM3001h2 = m2999f(i8);
/* 89 */                    i -= iMin;
                        }
/* 94 */                int iM3001h3 = m3001h(this.f7121a + i4);
/* 100 */               m3000g(this.f7121a, iM3001h3);
/* 103 */               this.f7121a = iM3001h3;
                    } else {
/* 107 */               int iM3001h4 = m3001h(i6 + i2);
/* 114 */               int iM3001h5 = m3001h(this.f7121a + i);
/* 118 */               int i10 = this.f7123c;
                        while (true) {
/* 120 */                   i10 -= i2;
/* 121 */                   if (i10 <= 0) {
                                break;
                            }
/* 123 */                   Object[] objArr2 = this.f7122b;
/* 133 */                   i2 = Math.min(i10, Math.min(objArr2.length - iM3001h4, objArr2.length - iM3001h5));
/* 137 */                   Object[] objArr3 = this.f7122b;
/* 139 */                   int i11 = iM3001h4 + i2;
/* 141 */                   C1960nd.m6965c(objArr3, iM3001h5, objArr3, iM3001h4, i11);
/* 144 */                   iM3001h4 = m3001h(i11);
/* 149 */                   iM3001h5 = m3001h(iM3001h5 + i2);
                        }
/* 159 */               int iM3001h6 = m3001h(this.f7123c + this.f7121a);
/* 169 */               m3000g(m2999f(iM3001h6 - i4), iM3001h6);
                    }
/* 175 */           this.f7123c -= i4;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean retainAll(Collection collection) {
                    int iM3001h;
                    Object[] objArr;
/* 1 */             collection.getClass();
/* 8 */             boolean z = false;
/* 8 */             z = false;
/* 8 */             z = false;
/* 9 */             if (!isEmpty() && this.f7122b.length != 0) {
/* 23 */                int iM3001h2 = m3001h(this.f7123c + this.f7121a);
/* 27 */                int i = this.f7121a;
/* 30 */                if (i < iM3001h2) {
/* 32 */                    iM3001h = i;
                            while (true) {
/* 33 */                        objArr = this.f7122b;
/* 35 */                        if (i >= iM3001h2) {
                                    break;
                                }
/* 37 */                        Object obj = objArr[i];
/* 43 */                        if (collection.contains(obj)) {
/* 49 */                            this.f7122b[iM3001h] = obj;
/* 47 */                            iM3001h++;
                                } else {
/* 53 */                            z = true;
                                }
/* 54 */                        i++;
                            }
/* 57 */                    C1960nd.m6968f(objArr, iM3001h, iM3001h2);
                        } else {
/* 63 */                    int length = this.f7122b.length;
/* 64 */                    boolean z2 = false;
/* 65 */                    int i2 = i;
/* 67 */                    while (i < length) {
/* 69 */                        Object[] objArr2 = this.f7122b;
/* 71 */                        Object obj2 = objArr2[i];
/* 73 */                        objArr2[i] = null;
/* 79 */                        if (collection.contains(obj2)) {
/* 85 */                            this.f7122b[i2] = obj2;
/* 83 */                            i2++;
                                } else {
/* 89 */                            z2 = true;
                                }
/* 90 */                        i++;
                            }
/* 93 */                    iM3001h = m3001h(i2);
/* 98 */                    for (int i3 = 0; i3 < iM3001h2; i3++) {
/* 100 */                       Object[] objArr3 = this.f7122b;
/* 102 */                       Object obj3 = objArr3[i3];
/* 104 */                       objArr3[i3] = null;
/* 110 */                       if (collection.contains(obj3)) {
/* 114 */                           this.f7122b[iM3001h] = obj3;
/* 116 */                           iM3001h = m2998e(iM3001h);
                                } else {
/* 121 */                           z2 = true;
                                }
                            }
/* 125 */                   z = z2;
                        }
/* 126 */               if (z) {
/* 128 */                   m3002i();
/* 138 */                   this.f7123c = m2999f(iM3001h - this.f7121a);
                        }
                    }
/* 140 */           return z;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i2 = this.f7123c;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7638a(i, i2);
/* 14 */            int iM3001h = m3001h(this.f7121a + i);
/* 18 */            Object[] objArr = this.f7122b;
/* 20 */            Object obj2 = objArr[iM3001h];
/* 22 */            objArr[iM3001h] = obj;
/* 24 */            return obj2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int length = objArr.length;
/* 5 */             int i = this.f7123c;
/* 7 */             if (length < i) {
/* 18 */                Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
/* 22 */                objNewInstance.getClass();
/* 25 */                objArr = (Object[]) objNewInstance;
                    }
/* 32 */            int iM3001h = m3001h(this.f7123c + this.f7121a);
/* 36 */            int i2 = this.f7121a;
/* 39 */            if (i2 < iM3001h) {
/* 43 */                C1960nd.m6965c(this.f7122b, 0, objArr, i2, iM3001h);
                    } else if (!isEmpty()) {
/* 53 */                Object[] objArr2 = this.f7122b;
/* 58 */                C1960nd.m6965c(objArr2, 0, objArr, this.f7121a, objArr2.length);
/* 61 */                Object[] objArr3 = this.f7122b;
/* 67 */                C1960nd.m6965c(objArr3, objArr3.length - this.f7121a, objArr, 0, iM3001h);
                    }
/* 70 */            int i3 = this.f7123c;
/* 73 */            if (i3 < objArr.length) {
/* 76 */                objArr[i3] = null;
                    }
/* 78 */            return objArr;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 78 */        public final Object[] toArray() {
/* 80 */            return toArray(new Object[mo0a()]);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 161 */       public final boolean add(Object obj) {
/* 162 */           addLast(obj);
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 213 */       public final boolean addAll(Collection collection) {
                    collection.getClass();
/* 214 */           if (collection.isEmpty()) {
                        return false;
                    }
/* 215 */           m3002i();
/* 217 */           m2997d(collection.size() + mo0a());
/* 220 */           m2996c(m3001h(mo0a() + this.f7121a), collection);
                    return true;
                }
            }
