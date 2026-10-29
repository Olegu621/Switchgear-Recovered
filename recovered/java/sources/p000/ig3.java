            package p000;

            import java.util.Arrays;
            import java.util.Objects;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ig3 extends yf3 implements Set {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f9584c = 0;

                /* JADX INFO: renamed from: b */
                public transient bg3 f9585b;

                /* JADX INFO: renamed from: f */
                public static int m4528f(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 9 */             if (iMax < 751619276) {
/* 13 */                int iHighestOneBit = Integer.highestOneBit(iMax - 1);
/* 28 */                do {
/* 17 */                    iHighestOneBit += iHighestOneBit;
/* 28 */                } while (((double) iHighestOneBit) * 0.7d < iMax);
/* 31 */                return iHighestOneBit;
                    }
/* 34 */            if (iMax < 1073741824) {
/* 32 */                return 1073741824;
                    }
/* 39 */            C1951n4.m6859j("collection too large");
/* 42 */            return 0;
                }

                /* JADX INFO: renamed from: g */
                public static ig3 m4529g(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 158 */               return lg3.f13271U;
                    }
/* 5 */             if (i == 1) {
/* 147 */               Object obj = objArr[0];
/* 149 */               Objects.requireNonNull(obj);
/* 154 */               return new mg3(obj);
                    }
/* 7 */             int iM4528f = m4528f(i);
/* 11 */            Object[] objArr2 = new Object[iM4528f];
/* 13 */            int i2 = iM4528f - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 19 */            for (int i5 = 0; i5 < i; i5++) {
/* 21 */                Object obj2 = objArr[i5];
/* 23 */                if (obj2 == null) {
/* 95 */                    C1951n4.m6868s(fm0.m3788n(new StringBuilder(String.valueOf(i5).length() + 9), "at index ", i5));
/* 18 */                    return null;
                        }
/* 25 */                int iHashCode = obj2.hashCode();
/* 46 */                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
                        while (true) {
/* 47 */                    int i6 = iRotateLeft & i2;
/* 49 */                    Object obj3 = objArr2[i6];
/* 51 */                    if (obj3 == null) {
/* 55 */                        objArr[i4] = obj2;
/* 57 */                        objArr2[i6] = obj2;
/* 59 */                        i3 += iHashCode;
/* 53 */                        i4++;
                                break;
                            }
/* 66 */                    if (obj3.equals(obj2)) {
                                break;
                            }
/* 68 */                    iRotateLeft++;
                        }
                    }
/* 99 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 102 */           if (i4 == 1) {
/* 104 */               Object obj4 = objArr[0];
/* 106 */               Objects.requireNonNull(obj4);
/* 111 */               return new mg3(obj4);
                    }
/* 121 */           if (m4528f(i4) < iM4528f / 2) {
/* 123 */               return m4529g(i4, objArr);
                    }
/* 128 */           int length = objArr.length;
/* 134 */           if (i4 < (length >> 1) + (length >> 2)) {
/* 136 */               objArr = Arrays.copyOf(objArr, i4);
                    }
/* 143 */           return new lg3(objArr, i3, objArr2, i2, i4);
                }

                /* JADX INFO: renamed from: e */
                public abstract wx2 mo4530e();

                @Override // java.util.Collection, java.util.Set
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if ((obj instanceof ig3) && (this instanceof lg3) && (((ig3) obj) instanceof lg3) && hashCode() != obj.hashCode()) {
/* 7 */                 return false;
                    }
/* 33 */            if (obj == this) {
/* 1 */                 return true;
                    }
/* 38 */            if (obj instanceof Set) {
/* 40 */                Set set = (Set) obj;
                        try {
                            return size() == set.size() && containsAll(set);
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 7 */             return false;
                }

                @Override // java.util.Collection, java.util.Set
                public abstract int hashCode();
            }
