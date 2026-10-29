            package p000;

            import java.util.ConcurrentModificationException;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public class le2 {

                /* JADX INFO: renamed from: d */
                public static Object[] f13207d;

                /* JADX INFO: renamed from: e */
                public static int f13208e;

                /* JADX INFO: renamed from: f */
                public static Object[] f13209f;

                /* JADX INFO: renamed from: i */
                public static int f13210i;

                /* JADX INFO: renamed from: a */
                public int[] f13211a;

                /* JADX INFO: renamed from: b */
                public Object[] f13212b;

                /* JADX INFO: renamed from: c */
                public int f13213c;

                public le2(int i) {
/* 4 */             if (i == 0) {
/* 8 */                 this.f13211a = py0.f15330d;
/* 12 */                this.f13212b = py0.f15331e;
                    } else {
/* 15 */                m6422a(i);
                    }
/* 19 */            this.f13213c = 0;
                }

                /* JADX INFO: renamed from: c */
                public static void m6421c(int[] iArr, Object[] objArr, int i) {
/* 10 */            if (iArr.length == 8) {
                        synchronized (le2.class) {
                            try {
/* 17 */                        if (f13210i < 10) {
/* 21 */                            objArr[0] = f13209f;
/* 23 */                            objArr[1] = iArr;
/* 28 */                            for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
/* 30 */                                objArr[i2] = null;
                                    }
/* 37 */                            f13209f = objArr;
/* 42 */                            f13210i++;
                                }
                            } catch (Throwable th) {
/* 47 */                        throw th;
                            }
                        }
/* 45 */                return;
                    }
/* 50 */            if (iArr.length == 4) {
                        synchronized (le2.class) {
                            try {
/* 57 */                        if (f13208e < 10) {
/* 61 */                            objArr[0] = f13207d;
/* 63 */                            objArr[1] = iArr;
/* 68 */                            for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
/* 70 */                                objArr[i3] = null;
                                    }
/* 77 */                            f13207d = objArr;
/* 82 */                            f13208e++;
                                }
                            } catch (Throwable th2) {
/* 87 */                        throw th2;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m6422a(int i) {
/* 6 */             if (i == 8) {
                        synchronized (le2.class) {
                            try {
/* 11 */                        Object[] objArr = f13209f;
/* 13 */                        if (objArr != null) {
/* 15 */                            this.f13212b = objArr;
/* 21 */                            f13209f = (Object[]) objArr[0];
/* 27 */                            this.f13211a = (int[]) objArr[1];
/* 29 */                            objArr[1] = null;
/* 31 */                            objArr[0] = null;
/* 36 */                            f13210i--;
/* 39 */                            return;
                                }
                            } catch (Throwable th) {
/* 45 */                        throw th;
                            }
                        }
                    } else if (i == 4) {
                        synchronized (le2.class) {
                            try {
/* 52 */                        Object[] objArr2 = f13207d;
/* 54 */                        if (objArr2 != null) {
/* 56 */                            this.f13212b = objArr2;
/* 62 */                            f13207d = (Object[]) objArr2[0];
/* 68 */                            this.f13211a = (int[]) objArr2[1];
/* 70 */                            objArr2[1] = null;
/* 72 */                            objArr2[0] = null;
/* 77 */                            f13208e--;
/* 80 */                            return;
                                }
                            } catch (Throwable th2) {
/* 86 */                        throw th2;
                            }
                        }
                    }
/* 89 */            this.f13211a = new int[i];
/* 94 */            this.f13212b = new Object[i << 1];
                }

                /* JADX INFO: renamed from: b */
                public final void m6423b(int i) {
/* 1 */             int i2 = this.f13213c;
/* 3 */             int[] iArr = this.f13211a;
/* 6 */             if (iArr.length < i) {
/* 8 */                 Object[] objArr = this.f13212b;
/* 10 */                m6422a(i);
/* 15 */                if (this.f13213c > 0) {
/* 20 */                    System.arraycopy(iArr, 0, this.f13211a, 0, i2);
/* 27 */                    System.arraycopy(objArr, 0, this.f13212b, 0, i2 << 1);
                        }
/* 30 */                m6421c(iArr, objArr, i2);
                    }
/* 35 */            if (this.f13213c != i2) {
/* 43 */                throw new ConcurrentModificationException();
                    }
                }

                public final void clear() {
/* 1 */             int i = this.f13213c;
/* 3 */             if (i > 0) {
/* 5 */                 int[] iArr = this.f13211a;
/* 7 */                 Object[] objArr = this.f13212b;
/* 11 */                this.f13211a = py0.f15330d;
/* 15 */                this.f13212b = py0.f15331e;
/* 18 */                this.f13213c = 0;
/* 20 */                m6421c(iArr, objArr, i);
                    }
/* 25 */            if (this.f13213c > 0) {
/* 33 */                throw new ConcurrentModificationException();
                    }
                }

                public final boolean containsKey(Object obj) {
                    return m6425e(obj) >= 0;
                }

                public final boolean containsValue(Object obj) {
                    return m6427g(obj) >= 0;
                }

                /* JADX INFO: renamed from: d */
                public final int m6424d(int i, Object obj) {
/* 1 */             int i2 = this.f13213c;
/* 3 */             if (i2 == 0) {
/* 5 */                 return -1;
                    }
                    try {
/* 9 */                 int iM7586I = py0.m7586I(i2, i, this.f13211a);
/* 13 */                if (iM7586I < 0 || obj.equals(this.f13212b[iM7586I << 1])) {
/* 28 */                    return iM7586I;
                        }
/* 29 */                int i3 = iM7586I + 1;
/* 31 */                while (i3 < i2 && this.f13211a[i3] == i) {
/* 49 */                    if (obj.equals(this.f13212b[i3 << 1])) {
/* 51 */                        return i3;
                            }
/* 52 */                    i3++;
                        }
/* 57 */                for (int i4 = iM7586I - 1; i4 >= 0 && this.f13211a[i4] == i; i4--) {
/* 75 */                    if (obj.equals(this.f13212b[i4 << 1])) {
/* 77 */                        return i4;
                            }
                        }
/* 81 */                return ~i3;
                    } catch (ArrayIndexOutOfBoundsException unused) {
/* 88 */                throw new ConcurrentModificationException();
                    }
                }

                /* JADX INFO: renamed from: e */
                public final int m6425e(Object obj) {
                    return obj == null ? m6426f() : m6424d(obj.hashCode(), obj);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof le2) {
/* 10 */                le2 le2Var = (le2) obj;
/* 16 */                if (this.f13213c != le2Var.f13213c) {
/* 7 */                     return false;
                        }
/* 22 */                for (int i = 0; i < this.f13213c; i++) {
                            try {
/* 24 */                        Object objM6428h = m6428h(i);
/* 28 */                        Object objM6430j = m6430j(i);
/* 33 */                        Object orDefault = le2Var.getOrDefault(objM6428h, null);
/* 37 */                        if (objM6430j == null) {
/* 39 */                            if (orDefault != null || !le2Var.containsKey(objM6428h)) {
/* 7 */                                 return false;
                                    }
                                } else if (!objM6430j.equals(orDefault)) {
/* 7 */                             return false;
                                }
                            } catch (ClassCastException | NullPointerException unused) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    }
/* 62 */            if (obj instanceof Map) {
/* 64 */                Map map = (Map) obj;
/* 72 */                if (this.f13213c != map.size()) {
/* 7 */                     return false;
                        }
/* 78 */                for (int i2 = 0; i2 < this.f13213c; i2++) {
                            try {
/* 80 */                        Object objM6428h2 = m6428h(i2);
/* 84 */                        Object objM6430j2 = m6430j(i2);
/* 88 */                        Object obj2 = map.get(objM6428h2);
/* 92 */                        if (objM6430j2 == null) {
/* 94 */                            if (obj2 != null || !map.containsKey(objM6428h2)) {
/* 7 */                                 return false;
                                    }
                                } else if (!objM6430j2.equals(obj2)) {
/* 7 */                             return false;
                                }
                            } catch (ClassCastException | NullPointerException unused2) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 7 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final int m6426f() {
/* 1 */             int i = this.f13213c;
/* 3 */             if (i == 0) {
/* 5 */                 return -1;
                    }
                    try {
/* 10 */                int iM7586I = py0.m7586I(i, 0, this.f13211a);
/* 14 */                if (iM7586I < 0 || this.f13212b[iM7586I << 1] == null) {
/* 25 */                    return iM7586I;
                        }
/* 26 */                int i2 = iM7586I + 1;
/* 28 */                while (i2 < i && this.f13211a[i2] == 0) {
/* 42 */                    if (this.f13212b[i2 << 1] == null) {
/* 44 */                        return i2;
                            }
/* 45 */                    i2++;
                        }
/* 50 */                for (int i3 = iM7586I - 1; i3 >= 0 && this.f13211a[i3] == 0; i3--) {
/* 64 */                    if (this.f13212b[i3 << 1] == null) {
/* 66 */                        return i3;
                            }
                        }
/* 70 */                return ~i2;
                    } catch (ArrayIndexOutOfBoundsException unused) {
/* 77 */                throw new ConcurrentModificationException();
                    }
                }

                /* JADX INFO: renamed from: g */
                public final int m6427g(Object obj) {
/* 3 */             int i = this.f13213c * 2;
/* 5 */             Object[] objArr = this.f13212b;
/* 8 */             if (obj == null) {
/* 11 */                for (int i2 = 1; i2 < i; i2 += 2) {
/* 15 */                    if (objArr[i2] == null) {
/* 17 */                        return i2 >> 1;
                            }
                        }
/* 40 */                return -1;
                    }
/* 24 */            for (int i3 = 1; i3 < i; i3 += 2) {
/* 32 */                if (obj.equals(objArr[i3])) {
/* 34 */                    return i3 >> 1;
                        }
                    }
/* 40 */            return -1;
                }

                public final Object get(Object obj) {
/* 2 */             return getOrDefault(obj, null);
                }

                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             int iM6425e = m6425e(obj);
                    return iM6425e >= 0 ? this.f13212b[(iM6425e << 1) + 1] : obj2;
                }

                /* JADX INFO: renamed from: h */
                public final Object m6428h(int i) {
/* 5 */             return this.f13212b[i << 1];
                }

                public final int hashCode() {
/* 1 */             int[] iArr = this.f13211a;
/* 3 */             Object[] objArr = this.f13212b;
/* 5 */             int i = this.f13213c;
/* 8 */             int i2 = 1;
/* 9 */             int i3 = 0;
/* 10 */            int iHashCode = 0;
/* 11 */            while (i3 < i) {
/* 13 */                Object obj = objArr[i2];
/* 26 */                iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
/* 27 */                i3++;
/* 29 */                i2 += 2;
                    }
/* 32 */            return iHashCode;
                }

                /* JADX INFO: renamed from: i */
                public final Object m6429i(int i) {
/* 1 */             Object[] objArr = this.f13212b;
/* 3 */             int i2 = i << 1;
/* 7 */             Object obj = objArr[i2 + 1];
/* 9 */             int i3 = this.f13213c;
/* 11 */            int[] iArr = this.f13211a;
/* 13 */            int i4 = 0;
/* 15 */            if (i3 <= 1) {
/* 17 */                m6421c(iArr, objArr, i3);
/* 22 */                this.f13211a = py0.f15330d;
/* 26 */                this.f13212b = py0.f15331e;
                    } else {
/* 29 */                int i5 = i3 - 1;
/* 34 */                if (iArr.length <= 8 || i3 >= iArr.length / 3) {
/* 93 */                    if (i < i5) {
/* 95 */                        int i6 = i + 1;
/* 97 */                        int i7 = i5 - i;
/* 99 */                        System.arraycopy(iArr, i6, iArr, i, i7);
/* 102 */                       Object[] objArr2 = this.f13212b;
/* 107 */                       System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                            }
/* 110 */                   Object[] objArr3 = this.f13212b;
/* 112 */                   int i8 = i5 << 1;
/* 115 */                   objArr3[i8] = null;
/* 118 */                   objArr3[i8 + 1] = null;
                        } else {
/* 47 */                    m6422a(i3 > 8 ? i3 + (i3 >> 1) : 8);
/* 52 */                    if (i3 != this.f13213c) {
/* 92 */                        throw new ConcurrentModificationException();
                            }
/* 54 */                    if (i > 0) {
/* 58 */                        System.arraycopy(iArr, 0, this.f13211a, 0, i);
/* 63 */                        System.arraycopy(objArr, 0, this.f13212b, 0, i2);
                            }
/* 66 */                    if (i < i5) {
/* 68 */                        int i9 = i + 1;
/* 72 */                        int i10 = i5 - i;
/* 74 */                        System.arraycopy(iArr, i9, this.f13211a, i, i10);
/* 83 */                        System.arraycopy(objArr, i9 << 1, this.f13212b, i2, i10 << 1);
                            }
                        }
/* 120 */               i4 = i5;
                    }
/* 123 */           if (i3 != this.f13213c) {
/* 133 */               throw new ConcurrentModificationException();
                    }
/* 125 */           this.f13213c = i4;
/* 127 */           return obj;
                }

                public final boolean isEmpty() {
                    return this.f13213c <= 0;
                }

                /* JADX INFO: renamed from: j */
                public final Object m6430j(int i) {
/* 7 */             return this.f13212b[(i << 1) + 1];
                }

                public final Object put(Object obj, Object obj2) {
                    int i;
                    int iM6424d;
/* 1 */             int i2 = this.f13213c;
/* 4 */             if (obj == null) {
/* 6 */                 iM6424d = m6426f();
/* 10 */                i = 0;
                    } else {
/* 12 */                int iHashCode = obj.hashCode();
/* 21 */                i = iHashCode;
/* 16 */                iM6424d = m6424d(iHashCode, obj);
                    }
/* 23 */            if (iM6424d >= 0) {
/* 27 */                int i3 = (iM6424d << 1) + 1;
/* 29 */                Object[] objArr = this.f13212b;
/* 31 */                Object obj3 = objArr[i3];
/* 33 */                objArr[i3] = obj2;
/* 35 */                return obj3;
                    }
/* 36 */            int i4 = ~iM6424d;
/* 37 */            int[] iArr = this.f13211a;
/* 40 */            if (i2 >= iArr.length) {
/* 42 */                int i5 = 8;
/* 44 */                if (i2 >= 8) {
/* 48 */                    i5 = (i2 >> 1) + i2;
                        } else if (i2 < 4) {
/* 54 */                    i5 = 4;
                        }
/* 55 */                Object[] objArr2 = this.f13212b;
/* 57 */                m6422a(i5);
/* 62 */                if (i2 != this.f13213c) {
/* 88 */                    throw new ConcurrentModificationException();
                        }
/* 64 */                int[] iArr2 = this.f13211a;
/* 67 */                if (iArr2.length > 0) {
/* 70 */                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
/* 76 */                    System.arraycopy(objArr2, 0, this.f13212b, 0, objArr2.length);
                        }
/* 79 */                m6421c(iArr, objArr2, i2);
                    }
/* 89 */            if (i4 < i2) {
/* 91 */                int[] iArr3 = this.f13211a;
/* 93 */                int i6 = i4 + 1;
/* 97 */                System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
/* 100 */               Object[] objArr3 = this.f13212b;
/* 111 */               System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f13213c - i4) << 1);
                    }
/* 114 */           int i7 = this.f13213c;
/* 116 */           if (i2 == i7) {
/* 118 */               int[] iArr4 = this.f13211a;
/* 121 */               if (i4 < iArr4.length) {
/* 123 */                   iArr4[i4] = i;
/* 125 */                   Object[] objArr4 = this.f13212b;
/* 127 */                   int i8 = i4 << 1;
/* 129 */                   objArr4[i8] = obj;
/* 133 */                   objArr4[i8 + 1] = obj2;
/* 137 */                   this.f13213c = i7 + 1;
/* 139 */                   return null;
                        }
                    }
/* 146 */           throw new ConcurrentModificationException();
                }

                public final Object putIfAbsent(Object obj, Object obj2) {
/* 2 */             Object orDefault = getOrDefault(obj, null);
                    return orDefault == null ? put(obj, obj2) : orDefault;
                }

                public final boolean remove(Object obj, Object obj2) {
/* 1 */             int iM6425e = m6425e(obj);
/* 5 */             if (iM6425e < 0) {
/* 26 */                return false;
                    }
/* 7 */             Object objM6430j = m6430j(iM6425e);
/* 11 */            if (obj2 != objM6430j && (obj2 == null || !obj2.equals(objM6430j))) {
/* 26 */                return false;
                    }
/* 21 */            m6429i(iM6425e);
/* 24 */            return true;
                }

                public final boolean replace(Object obj, Object obj2, Object obj3) {
/* 1 */             int iM6425e = m6425e(obj);
/* 5 */             if (iM6425e < 0) {
/* 31 */                return false;
                    }
/* 7 */             Object objM6430j = m6430j(iM6425e);
/* 11 */            if (objM6430j != obj2 && (obj2 == null || !obj2.equals(objM6430j))) {
/* 31 */                return false;
                    }
/* 23 */            int i = (iM6425e << 1) + 1;
/* 24 */            Object[] objArr = this.f13212b;
/* 26 */            Object obj4 = objArr[i];
/* 28 */            objArr[i] = obj3;
/* 21 */            return true;
                }

                public final int size() {
/* 1 */             return this.f13213c;
                }

                public final String toString() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.f13213c * 28);
/* 21 */            sb.append('{');
/* 27 */            for (int i = 0; i < this.f13213c; i++) {
/* 29 */                if (i > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 36 */                Object objM6428h = m6428h(i);
/* 42 */                if (objM6428h != this) {
/* 44 */                    sb.append(objM6428h);
                        } else {
/* 48 */                    sb.append("(this Map)");
                        }
/* 53 */                sb.append('=');
/* 56 */                Object objM6430j = m6430j(i);
/* 60 */                if (objM6430j != this) {
/* 62 */                    sb.append(objM6430j);
                        } else {
/* 66 */                    sb.append("(this Map)");
                        }
                    }
/* 74 */            sb.append('}');
/* 77 */            return sb.toString();
                }

/* 21 */        public le2() {
/* 23 */            this.f13211a = py0.f15330d;
/* 24 */            this.f13212b = py0.f15331e;
/* 25 */            this.f13213c = 0;
                }

/* 27 */        public final Object remove(Object obj) {
/* 28 */            int iM6425e = m6425e(obj);
                    if (iM6425e >= 0) {
/* 29 */                return m6429i(iM6425e);
                    }
                    return null;
                }

/* 32 */        public final Object replace(Object obj, Object obj2) {
/* 33 */            int iM6425e = m6425e(obj);
                    if (iM6425e < 0) {
                        return null;
                    }
                    int i = (iM6425e << 1) + 1;
/* 34 */            Object[] objArr = this.f13212b;
                    Object obj3 = objArr[i];
/* 35 */            objArr[i] = obj2;
                    return obj3;
                }
            }
