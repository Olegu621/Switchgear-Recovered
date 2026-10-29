            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class fx0 extends vw0 implements Set {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f8391c = 0;

                /* JADX INFO: renamed from: b */
                public transient zw0 f8392b;

                /* JADX INFO: renamed from: g */
                public static int m3850g(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 10 */            if (iMax < 751619276) {
/* 18 */                int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
/* 29 */                while (((double) iHighestOneBit) * 0.7d < iMax) {
/* 31 */                    iHighestOneBit <<= 1;
                        }
/* 34 */                return iHighestOneBit;
                    }
/* 41 */            if (iMax < 1073741824) {
/* 35 */                return 1073741824;
                    }
/* 46 */            C1951n4.m6859j("collection too large");
/* 49 */            return 0;
                }

                /* JADX INFO: renamed from: h */
                public static fx0 m3851h(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 144 */               return z22.f19912U;
                    }
/* 5 */             if (i == 1) {
/* 133 */               Object obj = objArr[0];
/* 135 */               Objects.requireNonNull(obj);
/* 140 */               return new re2(obj);
                    }
/* 7 */             int iM3850g = m3850g(i);
/* 11 */            Object[] objArr2 = new Object[iM3850g];
/* 13 */            int i2 = iM3850g - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 18 */            for (int i5 = 0; i5 < i; i5++) {
/* 20 */                Object obj2 = objArr[i5];
/* 22 */                if (obj2 == null) {
/* 65 */                    StringBuilder sb = new StringBuilder(20);
/* 70 */                    sb.append("at index ");
/* 73 */                    sb.append(i5);
/* 83 */                    throw new NullPointerException(sb.toString());
                        }
/* 24 */                int iHashCode = obj2.hashCode();
/* 28 */                int iM7444z = pg3.m7444z(iHashCode);
                        while (true) {
/* 32 */                    int i6 = iM7444z & i2;
/* 34 */                    Object obj3 = objArr2[i6];
/* 36 */                    if (obj3 == null) {
/* 40 */                        objArr[i4] = obj2;
/* 42 */                        objArr2[i6] = obj2;
/* 44 */                        i3 += iHashCode;
/* 38 */                        i4++;
                                break;
                            }
/* 51 */                    if (obj3.equals(obj2)) {
                                break;
                            }
/* 56 */                    iM7444z++;
                        }
                    }
/* 85 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 88 */            if (i4 == 1) {
/* 90 */                Object obj4 = objArr[0];
/* 92 */                Objects.requireNonNull(obj4);
/* 97 */                return new re2(obj4);
                    }
/* 107 */           if (m3850g(i4) < iM3850g / 2) {
/* 109 */               return m3851h(i4, objArr);
                    }
/* 114 */           int length = objArr.length;
/* 120 */           if (i4 < (length >> 1) + (length >> 2)) {
/* 122 */               objArr = Arrays.copyOf(objArr, i4);
                    }
/* 129 */           return new z22(objArr, i3, objArr2, i2, i4);
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if ((obj instanceof fx0) && (this instanceof z22) && (((fx0) obj) instanceof z22) && hashCode() != obj.hashCode()) {
/* 7 */                 return false;
                    }
/* 32 */            if (this != obj) {
/* 37 */                if (obj instanceof Set) {
/* 39 */                    Set set = (Set) obj;
                            try {
/* 49 */                        if (size() != set.size() || !containsAll(set)) {
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: f */
                public zw0 mo3852f() {
/* 1 */             zw0 zw0Var = this.f8392b;
/* 3 */             if (zw0Var != null) {
/* 11 */                return zw0Var;
                    }
/* 5 */             zw0 zw0VarMo3853i = mo3853i();
/* 9 */             this.f8392b = zw0VarMo3853i;
/* 11 */            return zw0VarMo3853i;
                }

                @Override // java.util.Collection, java.util.Set
                public int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int i = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 27 */                i = ~(~(i + (next != null ? next.hashCode() : 0)));
                    }
/* 29 */            return i;
                }

                /* JADX INFO: renamed from: i */
                public zw0 mo3853i() {
/* 3 */             Object[] array = toArray(vw0.f18371a);
/* 7 */             ww0 ww0Var = zw0.f20360b;
/* 10 */            return zw0.m10447f(array.length, array);
                }

                @Override // p000.vw0
                public Object writeReplace() {
/* 9 */             return new ex0(toArray(vw0.f18371a));
                }
            }
