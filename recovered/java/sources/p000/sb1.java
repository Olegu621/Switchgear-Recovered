            package p000;

            import java.io.InvalidObjectException;
            import java.io.NotSerializableException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 55 */    public final class sb1 implements Map, Serializable, r21 {

                /* JADX INFO: renamed from: Y */
                public static final ob1 f16491Y = new ob1(null);

                /* JADX INFO: renamed from: Z */
                public static final sb1 f16492Z;

                /* JADX INFO: renamed from: U */
                public ub1 f16493U;

                /* JADX INFO: renamed from: V */
                public vb1 f16494V;

                /* JADX INFO: renamed from: W */
                public tb1 f16495W;

                /* JADX INFO: renamed from: X */
                public boolean f16496X;

                /* JADX INFO: renamed from: a */
                public Object[] f16497a;

                /* JADX INFO: renamed from: b */
                public Object[] f16498b;

                /* JADX INFO: renamed from: c */
                public int[] f16499c;

                /* JADX INFO: renamed from: d */
                public int[] f16500d;

                /* JADX INFO: renamed from: e */
                public int f16501e;

                /* JADX INFO: renamed from: f */
                public int f16502f;

                /* JADX INFO: renamed from: i */
                public int f16503i;

                /* JADX INFO: renamed from: v */
                public int f16504v;

                /* JADX INFO: renamed from: w */
                public int f16505w;

                static {
/* 12 */            sb1 sb1Var = new sb1(0);
/* 16 */            sb1Var.f16496X = true;
/* 18 */            f16492Z = sb1Var;
                }

                public sb1(int i) {
/* 1 */             if (i < 0) {
/* 52 */                C1951n4.m6859j("capacity must be non-negative.");
/* 56 */                throw null;
                    }
/* 3 */             Object[] objArr = new Object[i];
/* 5 */             int[] iArr = new int[i];
/* 9 */             f16491Y.getClass();
/* 18 */            int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
/* 27 */            this.f16497a = objArr;
/* 30 */            this.f16498b = null;
/* 32 */            this.f16499c = iArr;
/* 34 */            this.f16500d = new int[iHighestOneBit];
/* 37 */            this.f16501e = 2;
/* 40 */            this.f16502f = 0;
/* 47 */            this.f16503i = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
                }

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() throws NotSerializableException {
/* 3 */             if (!this.f16496X) {
/* 20 */                throw new NotSerializableException("The map cannot be serialized while it is being built.");
                    }
/* 7 */             la2 la2Var = new la2();
/* 10 */            la2Var.f13163a = this;
/* 12 */            return la2Var;
                }

                /* JADX INFO: renamed from: a */
                public final int m8461a(Object obj) {
/* 1 */             m8462b();
                    while (true) {
/* 4 */                 int iM8468h = m8468h(obj);
/* 10 */                int i = this.f16501e * 2;
/* 15 */                int length = this.f16500d.length / 2;
/* 17 */                if (i > length) {
/* 19 */                    i = length;
                        }
/* 20 */                int i2 = 0;
                        while (true) {
/* 21 */                    int[] iArr = this.f16500d;
/* 23 */                    int i3 = iArr[iM8468h];
/* 26 */                    if (i3 <= 0) {
/* 28 */                        int i4 = this.f16502f;
/* 30 */                        Object[] objArr = this.f16497a;
/* 33 */                        if (i4 >= objArr.length) {
/* 35 */                            m8465e(1);
                                    break;
                                }
/* 39 */                        int i5 = i4 + 1;
/* 41 */                        this.f16502f = i5;
/* 43 */                        objArr[i4] = obj;
/* 47 */                        this.f16499c[i4] = iM8468h;
/* 49 */                        iArr[iM8468h] = i5;
/* 54 */                        this.f16505w++;
/* 59 */                        this.f16504v++;
/* 63 */                        if (i2 > this.f16501e) {
/* 65 */                            this.f16501e = i2;
                                }
/* 67 */                        return i4;
                            }
/* 78 */                    if (Intrinsics.m6216a(this.f16497a[i3 - 1], obj)) {
/* 80 */                        return -i3;
                            }
/* 82 */                    i2++;
/* 84 */                    if (i2 > i) {
/* 91 */                        m8469i(this.f16500d.length * 2);
                                break;
                            }
/* 104 */                   iM8468h = iM8468h == 0 ? this.f16500d.length - 1 : iM8468h - 1;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m8462b() {
/* 3 */             if (this.f16496X) {
/* 6 */                 f42.m3660p();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m8463c(boolean z) {
                    int i;
/* 1 */             Object[] objArr = this.f16498b;
/* 3 */             int i2 = 0;
/* 4 */             int i3 = 0;
                    while (true) {
/* 5 */                 i = this.f16502f;
/* 7 */                 if (i2 >= i) {
                            break;
                        }
/* 9 */                 int[] iArr = this.f16499c;
/* 11 */                int i4 = iArr[i2];
/* 13 */                if (i4 >= 0) {
/* 15 */                    Object[] objArr2 = this.f16497a;
/* 19 */                    objArr2[i3] = objArr2[i2];
/* 21 */                    if (objArr != null) {
/* 25 */                        objArr[i3] = objArr[i2];
                            }
/* 27 */                    if (z) {
/* 29 */                        iArr[i3] = i4;
/* 35 */                        this.f16500d[i4] = i3 + 1;
                            }
/* 37 */                    i3++;
                        }
/* 39 */                i2++;
                    }
/* 44 */            b40.m1211B(this.f16497a, i3, i);
/* 47 */            if (objArr != null) {
/* 51 */                b40.m1211B(objArr, i3, this.f16502f);
                    }
/* 54 */            this.f16502f = i3;
                }

                @Override // java.util.Map
                public final void clear() {
/* 1 */             m8462b();
/* 6 */             int i = this.f16502f - 1;
/* 9 */             if (i >= 0) {
/* 11 */                int i2 = 0;
                        while (true) {
/* 12 */                    int[] iArr = this.f16499c;
/* 14 */                    int i3 = iArr[i2];
/* 16 */                    if (i3 >= 0) {
/* 20 */                        this.f16500d[i3] = 0;
/* 23 */                        iArr[i2] = -1;
                            }
/* 25 */                    if (i2 == i) {
                                break;
                            } else {
/* 27 */                        i2++;
                            }
                        }
                    }
/* 34 */            b40.m1211B(this.f16497a, 0, this.f16502f);
/* 37 */            Object[] objArr = this.f16498b;
/* 39 */            if (objArr != null) {
/* 43 */                b40.m1211B(objArr, 0, this.f16502f);
                    }
/* 46 */            this.f16505w = 0;
/* 48 */            this.f16502f = 0;
/* 54 */            this.f16504v++;
                }

                @Override // java.util.Map
                public final boolean containsKey(Object obj) {
                    return m8466f(obj) >= 0;
                }

                @Override // java.util.Map
                public final boolean containsValue(Object obj) {
                    return m8467g(obj) >= 0;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m8464d(Collection collection) {
                    boolean zM6216a;
/* 1 */             collection.getClass();
/* 12 */            for (Object obj : collection) {
/* 19 */                if (obj != null) {
                            try {
/* 21 */                        Map.Entry entry = (Map.Entry) obj;
/* 27 */                        int iM8466f = m8466f(entry.getKey());
/* 31 */                        if (iM8466f < 0) {
/* 33 */                            zM6216a = false;
                                } else {
/* 35 */                            Object[] objArr = this.f16498b;
/* 37 */                            objArr.getClass();
/* 46 */                            zM6216a = Intrinsics.m6216a(objArr[iM8466f], entry.getValue());
                                }
/* 50 */                        if (!zM6216a) {
                                }
                            } catch (ClassCastException unused) {
                            }
                        }
/* 18 */                return false;
                    }
/* 53 */            return true;
                }

                /* JADX INFO: renamed from: e */
                public final void m8465e(int i) {
/* 1 */             Object[] objArr = this.f16497a;
/* 3 */             int length = objArr.length;
/* 4 */             int i2 = this.f16502f;
/* 6 */             int i3 = length - i2;
/* 9 */             int i4 = i2 - this.f16505w;
/* 12 */            if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
/* 22 */                m8463c(true);
/* 25 */                return;
                    }
/* 26 */            int i5 = i2 + i;
/* 27 */            if (i5 < 0) {
/* 102 */               throw new OutOfMemoryError();
                    }
/* 30 */            if (i5 > objArr.length) {
/* 32 */                C2089q c2089q = AbstractC2237u.Companion;
/* 34 */                int length2 = objArr.length;
/* 35 */                c2089q.getClass();
/* 38 */                int iM7641d = C2089q.m7641d(length2, i5);
/* 42 */                Object[] objArr2 = this.f16497a;
/* 44 */                objArr2.getClass();
/* 51 */                this.f16497a = Arrays.copyOf(objArr2, iM7641d);
/* 53 */                Object[] objArr3 = this.f16498b;
/* 63 */                this.f16498b = objArr3 != null ? Arrays.copyOf(objArr3, iM7641d) : null;
/* 71 */                this.f16499c = Arrays.copyOf(this.f16499c, iM7641d);
/* 75 */                f16491Y.getClass();
/* 84 */                int iHighestOneBit = Integer.highestOneBit((iM7641d >= 1 ? iM7641d : 1) * 3);
/* 91 */                if (iHighestOneBit > this.f16500d.length) {
/* 93 */                    m8469i(iHighestOneBit);
                        }
                    }
                }

                @Override // java.util.Map
                public final Set entrySet() {
/* 1 */             tb1 tb1Var = this.f16495W;
/* 3 */             if (tb1Var != null) {
/* 12 */                return tb1Var;
                    }
/* 7 */             tb1 tb1Var2 = new tb1(this);
/* 10 */            this.f16495W = tb1Var2;
/* 12 */            return tb1Var2;
                }

                @Override // java.util.Map
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 5 */             if (!(obj instanceof Map)) {
/* 28 */                return false;
                    }
/* 7 */             Map map = (Map) obj;
                    return this.f16505w == map.size() && m8464d(map.entrySet());
                }

                /* JADX INFO: renamed from: f */
                public final int m8466f(Object obj) {
/* 1 */             int iM8468h = m8468h(obj);
/* 5 */             int i = this.f16501e;
                    while (true) {
/* 9 */                 int i2 = this.f16500d[iM8468h];
/* 12 */                if (i2 == 0) {
/* 11 */                    return -1;
                        }
/* 15 */                if (i2 > 0) {
/* 19 */                    int i3 = i2 - 1;
/* 27 */                    if (Intrinsics.m6216a(this.f16497a[i3], obj)) {
/* 29 */                        return i3;
                            }
                        }
/* 30 */                i--;
/* 31 */                if (i < 0) {
/* 11 */                    return -1;
                        }
/* 44 */                iM8468h = iM8468h == 0 ? this.f16500d.length - 1 : iM8468h - 1;
                    }
                }

                /* JADX INFO: renamed from: g */
                public final int m8467g(Object obj) {
/* 1 */             int i = this.f16502f;
                    while (true) {
/* 4 */                 i--;
/* 5 */                 if (i < 0) {
/* 3 */                     return -1;
                        }
/* 11 */                if (this.f16499c[i] >= 0) {
/* 13 */                    Object[] objArr = this.f16498b;
/* 15 */                    objArr.getClass();
/* 24 */                    if (Intrinsics.m6216a(objArr[i], obj)) {
/* 26 */                        return i;
                            }
                        }
                    }
                }

                @Override // java.util.Map
                public final Object get(Object obj) {
/* 1 */             int iM8466f = m8466f(obj);
/* 5 */             if (iM8466f < 0) {
/* 7 */                 return null;
                    }
/* 9 */             Object[] objArr = this.f16498b;
/* 11 */            objArr.getClass();
/* 14 */            return objArr[iM8466f];
                }

                /* JADX INFO: renamed from: h */
                public final int m8468h(Object obj) {
/* 15 */            return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f16503i;
                }

                @Override // java.util.Map
                public final int hashCode() {
/* 4 */             pb1 pb1Var = new pb1(this, 0);
/* 7 */             int i = 0;
/* 12 */            while (pb1Var.hasNext()) {
/* 14 */                int i2 = pb1Var.f15962a;
/* 18 */                sb1 sb1Var = (sb1) pb1Var.f15965d;
/* 22 */                if (i2 >= sb1Var.f16502f) {
/* 65 */                    C1951n4.m6864o();
/* 3 */                     return 0;
                        }
/* 26 */                pb1Var.f15962a = i2 + 1;
/* 28 */                pb1Var.f15963b = i2;
/* 32 */                Object obj = sb1Var.f16497a[i2];
/* 41 */                int iHashCode = obj != null ? obj.hashCode() : 0;
/* 42 */                Object[] objArr = sb1Var.f16498b;
/* 44 */                objArr.getClass();
/* 49 */                Object obj2 = objArr[pb1Var.f15963b];
/* 58 */                int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
/* 60 */                pb1Var.m8128e();
/* 63 */                i += iHashCode ^ iHashCode2;
                    }
/* 69 */            return i;
                }

                /* JADX INFO: renamed from: i */
                public final void m8469i(int i) {
                    int[] iArr;
/* 5 */             this.f16504v++;
/* 11 */            int i2 = 0;
/* 12 */            if (this.f16502f > this.f16505w) {
/* 14 */                m8463c(false);
                    }
/* 19 */            this.f16500d = new int[i];
/* 23 */            f16491Y.getClass();
/* 32 */            this.f16503i = Integer.numberOfLeadingZeros(i) + 1;
/* 36 */            while (i2 < this.f16502f) {
/* 38 */                int i3 = i2 + 1;
/* 44 */                int iM8468h = m8468h(this.f16497a[i2]);
/* 48 */                int i4 = this.f16501e;
                        while (true) {
/* 50 */                    iArr = this.f16500d;
/* 54 */                    if (iArr[iM8468h] == 0) {
                                break;
                            }
/* 64 */                    i4--;
/* 66 */                    if (i4 < 0) {
/* 80 */                        f42.m3656l("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
/* 83 */                        return;
                            }
/* 76 */                    iM8468h = iM8468h == 0 ? iArr.length - 1 : iM8468h - 1;
                        }
/* 56 */                iArr[iM8468h] = i3;
/* 60 */                this.f16499c[i2] = iM8468h;
/* 62 */                i2 = i3;
                    }
                }

                @Override // java.util.Map
                public final boolean isEmpty() {
                    return this.f16505w == 0;
                }

                /* JADX INFO: renamed from: j */
                public final void m8470j(int i) {
/* 1 */             Object[] objArr = this.f16497a;
/* 3 */             objArr.getClass();
/* 7 */             objArr[i] = null;
/* 9 */             Object[] objArr2 = this.f16498b;
/* 11 */            if (objArr2 != null) {
/* 13 */                objArr2[i] = null;
                    }
/* 17 */            int length = this.f16499c[i];
/* 21 */            int i2 = this.f16501e * 2;
/* 26 */            int length2 = this.f16500d.length / 2;
/* 28 */            if (i2 > length2) {
/* 30 */                i2 = length2;
                    }
/* 32 */            int i3 = i2;
/* 33 */            int i4 = 0;
/* 34 */            int i5 = length;
/* 99 */            do {
/* 45 */                length = length == 0 ? this.f16500d.length - 1 : length - 1;
/* 46 */                i4++;
/* 48 */                int i6 = this.f16501e;
/* 50 */                int[] iArr = this.f16500d;
/* 53 */                if (i4 > i6) {
/* 55 */                    iArr[i5] = 0;
                        } else {
/* 58 */                    int i7 = iArr[length];
/* 60 */                    if (i7 == 0) {
/* 62 */                        iArr[i5] = 0;
                            } else {
/* 65 */                        if (i7 < 0) {
/* 67 */                            iArr[i5] = -1;
                                } else {
/* 74 */                            int i8 = i7 - 1;
/* 82 */                            int iM8468h = m8468h(this.f16497a[i8]) - length;
/* 83 */                            int[] iArr2 = this.f16500d;
/* 89 */                            if ((iM8468h & (iArr2.length - 1)) >= i4) {
/* 91 */                                iArr2[i5] = i7;
/* 95 */                                this.f16499c[i8] = i5;
                                    }
/* 98 */                            i3--;
                                }
/* 69 */                        i5 = length;
/* 70 */                        i4 = 0;
/* 98 */                        i3--;
                            }
                        }
/* 107 */               this.f16499c[i] = -1;
/* 112 */               this.f16505w--;
/* 118 */               this.f16504v++;
/* 99 */            } while (i3 >= 0);
/* 103 */           this.f16500d[i5] = -1;
/* 107 */           this.f16499c[i] = -1;
/* 112 */           this.f16505w--;
/* 118 */           this.f16504v++;
                }

                @Override // java.util.Map
                public final Set keySet() {
/* 1 */             ub1 ub1Var = this.f16493U;
/* 3 */             if (ub1Var != null) {
/* 12 */                return ub1Var;
                    }
/* 7 */             ub1 ub1Var2 = new ub1(this);
/* 10 */            this.f16493U = ub1Var2;
/* 12 */            return ub1Var2;
                }

                @Override // java.util.Map
                public final Object put(Object obj, Object obj2) {
/* 1 */             m8462b();
/* 4 */             int iM8461a = m8461a(obj);
/* 8 */             Object[] objArr = this.f16498b;
/* 11 */            if (objArr == null) {
/* 16 */                int length = this.f16497a.length;
/* 17 */                if (length < 0) {
/* 38 */                    C1951n4.m6859j("capacity must be non-negative.");
/* 10 */                    return null;
                        }
/* 19 */                objArr = new Object[length];
/* 21 */                this.f16498b = objArr;
                    }
/* 23 */            if (iM8461a >= 0) {
/* 33 */                objArr[iM8461a] = obj2;
/* 10 */                return null;
                    }
/* 26 */            int i = (-iM8461a) - 1;
/* 28 */            Object obj3 = objArr[i];
/* 30 */            objArr[i] = obj2;
/* 32 */            return obj3;
                }

                @Override // java.util.Map
                public final void putAll(Map map) {
/* 1 */             map.getClass();
/* 4 */             m8462b();
/* 7 */             Set<Map.Entry> setEntrySet = map.entrySet();
/* 15 */            if (setEntrySet.isEmpty()) {
/* 99 */                return;
                    }
/* 22 */            m8465e(setEntrySet.size());
/* 33 */            for (Map.Entry entry : setEntrySet) {
/* 45 */                int iM8461a = m8461a(entry.getKey());
/* 49 */                Object[] objArr = this.f16498b;
/* 51 */                if (objArr == null) {
/* 56 */                    int length = this.f16497a.length;
/* 57 */                    if (length < 0) {
/* 96 */                        C1951n4.m6859j("capacity must be non-negative.");
/* 99 */                        return;
                            } else {
/* 59 */                        objArr = new Object[length];
/* 61 */                        this.f16498b = objArr;
                            }
                        }
/* 63 */                if (iM8461a >= 0) {
/* 69 */                    objArr[iM8461a] = entry.getValue();
                        } else {
/* 73 */                    int i = (-iM8461a) - 1;
/* 85 */                    if (!Intrinsics.m6216a(entry.getValue(), objArr[i])) {
/* 91 */                        objArr[i] = entry.getValue();
                            }
                        }
                    }
                }

                @Override // java.util.Map
                public final Object remove(Object obj) {
/* 1 */             m8462b();
/* 4 */             int iM8466f = m8466f(obj);
/* 8 */             if (iM8466f < 0) {
/* 10 */                return null;
                    }
/* 12 */            Object[] objArr = this.f16498b;
/* 14 */            objArr.getClass();
/* 17 */            Object obj2 = objArr[iM8466f];
/* 19 */            m8470j(iM8466f);
/* 22 */            return obj2;
                }

                @Override // java.util.Map
                public final int size() {
/* 1 */             return this.f16505w;
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder((this.f16505w * 3) + 2);
/* 14 */            sb.append("{");
/* 19 */            int i = 0;
/* 20 */            pb1 pb1Var = new pb1(this, 0);
/* 27 */            while (pb1Var.hasNext()) {
/* 29 */                if (i > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 36 */                int i2 = pb1Var.f15962a;
/* 40 */                sb1 sb1Var = (sb1) pb1Var.f15965d;
/* 44 */                if (i2 >= sb1Var.f16502f) {
/* 96 */                    C1951n4.m6864o();
/* 99 */                    return null;
                        }
/* 48 */                pb1Var.f15962a = i2 + 1;
/* 50 */                pb1Var.f15963b = i2;
/* 54 */                Object obj = sb1Var.f16497a[i2];
/* 58 */                if (obj == sb1Var) {
/* 60 */                    sb.append("(this Map)");
                        } else {
/* 64 */                    sb.append(obj);
                        }
/* 69 */                sb.append('=');
/* 72 */                Object[] objArr = sb1Var.f16498b;
/* 74 */                objArr.getClass();
/* 79 */                Object obj2 = objArr[pb1Var.f15963b];
/* 81 */                if (obj2 == sb1Var) {
/* 83 */                    sb.append("(this Map)");
                        } else {
/* 87 */                    sb.append(obj2);
                        }
/* 90 */                pb1Var.m8128e();
/* 93 */                i++;
                    }
/* 103 */           sb.append("}");
/* 106 */           return sb.toString();
                }

                @Override // java.util.Map
                public final Collection values() {
/* 1 */             vb1 vb1Var = this.f16494V;
/* 3 */             if (vb1Var != null) {
/* 12 */                return vb1Var;
                    }
/* 7 */             vb1 vb1Var2 = new vb1(this);
/* 10 */            this.f16494V = vb1Var2;
/* 12 */            return vb1Var2;
                }

/* 56 */        public sb1() {
/* 57 */            this(8);
                }
            }
