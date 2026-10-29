            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class tq0 extends AbstractC2350x {
                private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
                private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
                static final int UNINITIALIZED_HASH_CODE = 0;
                static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
                private static Map<Object, tq0> defaultInstanceMap = new ConcurrentHashMap();
                private int memoizedSerializedSize;
                protected sx2 unknownFields;

                public tq0() {
/* 5 */             this.memoizedHashCode = 0;
/* 8 */             this.memoizedSerializedSize = -1;
/* 12 */            this.unknownFields = sx2.f16858f;
                }

                /* JADX INFO: renamed from: d */
                public static tq0 m8852d(Class cls) {
/* 3 */             tq0 tq0Var = defaultInstanceMap.get(cls);
/* 9 */             if (tq0Var == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 25 */                    tq0Var = defaultInstanceMap.get(cls);
                        } catch (ClassNotFoundException e) {
/* 40 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 41 */            if (tq0Var != null) {
/* 69 */                return tq0Var;
                    }
/* 54 */            tq0 tq0Var2 = (tq0) ((tq0) ny2.m7072d(cls)).mo7066c(6);
/* 56 */            if (tq0Var2 != null) {
/* 60 */                defaultInstanceMap.put(cls, tq0Var2);
/* 63 */                return tq0Var2;
                    }
/* 64 */            f42.m3664t();
/* 67 */            return null;
                }

                /* JADX INFO: renamed from: e */
                public static Object m8853e(Method method, tq0 tq0Var, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(tq0Var, objArr);
                    } catch (IllegalAccessException e) {
/* 35 */                ds0.m3198o("Couldn't use Java reflection to implement protocol message reflection.", e);
/* 1 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 8 */                 Throwable cause = e2.getCause();
/* 14 */                if (cause instanceof RuntimeException) {
/* 31 */                    throw ((RuntimeException) cause);
                        }
/* 18 */                if (cause instanceof Error) {
/* 28 */                    throw ((Error) cause);
                        }
/* 22 */                ds0.m3198o("Unexpected exception thrown by generated accessor method.", cause);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: f */
                public static final boolean m8854f(tq0 tq0Var, boolean z) {
/* 8 */             byte bByteValue = ((Byte) tq0Var.mo7066c(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 19 */            cz1 cz1Var = cz1.f6940c;
/* 21 */            cz1Var.getClass();
/* 32 */            boolean zMo4493c = cz1Var.m2900a(tq0Var.getClass()).mo4493c(tq0Var);
/* 36 */            if (z) {
/* 39 */                tq0Var.mo7066c(2);
                    }
/* 42 */            return zMo4493c;
                }

                /* JADX INFO: renamed from: j */
                public static void m8855j(Class cls, tq0 tq0Var) {
/* 1 */             tq0Var.m8859h();
/* 6 */             defaultInstanceMap.put(cls, tq0Var);
                }

                @Override // p000.AbstractC2350x
                /* JADX INFO: renamed from: a */
                public final int mo8856a(i72 i72Var) {
                    int iMo4497g;
                    int iMo4497g2;
/* 5 */             if (m8858g()) {
/* 7 */                 if (i72Var == null) {
/* 9 */                     cz1 cz1Var = cz1.f6940c;
/* 11 */                    cz1Var.getClass();
/* 22 */                    iMo4497g2 = cz1Var.m2900a(getClass()).mo4497g(this);
                        } else {
/* 27 */                    iMo4497g2 = i72Var.mo4497g(this);
                        }
/* 31 */                if (iMo4497g2 >= 0) {
/* 33 */                    return iMo4497g2;
                        }
/* 40 */                f42.m3656l(fm0.m3781g(iMo4497g2, "serialized size must be non-negative, was "));
/* 43 */                return 0;
                    }
/* 45 */            int i = this.memoizedSerializedSize;
/* 52 */            if ((i & AbstractC0208c9.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
/* 54 */                return i & AbstractC0208c9.API_PRIORITY_OTHER;
                    }
/* 57 */            if (i72Var == null) {
/* 59 */                cz1 cz1Var2 = cz1.f6940c;
/* 61 */                cz1Var2.getClass();
/* 72 */                iMo4497g = cz1Var2.m2900a(getClass()).mo4497g(this);
                    } else {
/* 77 */                iMo4497g = i72Var.mo4497g(this);
                    }
/* 81 */            m8861k(iMo4497g);
/* 84 */            return iMo4497g;
                }

                @Override // p000.AbstractC2350x
                /* JADX INFO: renamed from: b */
                public final void mo8857b(C1905lw c1905lw) {
/* 1 */             cz1 cz1Var = cz1.f6940c;
/* 3 */             cz1Var.getClass();
/* 10 */            i72 i72VarM2900a = cz1Var.m2900a(getClass());
/* 14 */            gr0 gr0Var = c1905lw.f13506a;
/* 16 */            if (gr0Var == null) {
/* 21 */                gr0Var = new gr0();
/* 26 */                fz0.m3858a(c1905lw, "output");
/* 29 */                gr0Var.f8789a = c1905lw;
/* 31 */                c1905lw.f13506a = gr0Var;
                    }
/* 33 */            i72VarM2900a.mo4498h(this, gr0Var);
                }

                /* JADX INFO: renamed from: c */
                public abstract Object mo7066c(int i);

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 20 */            cz1 cz1Var = cz1.f6940c;
/* 22 */            cz1Var.getClass();
/* 35 */            return cz1Var.m2900a(getClass()).mo4495e(this, (tq0) obj);
                }

                /* JADX INFO: renamed from: g */
                public final boolean m8858g() {
                    return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
                }

                /* JADX INFO: renamed from: h */
                public final void m8859h() {
/* 7 */             this.memoizedSerializedSize &= AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final int hashCode() {
/* 5 */             if (m8858g()) {
/* 7 */                 cz1 cz1Var = cz1.f6940c;
/* 9 */                 cz1Var.getClass();
/* 20 */                return cz1Var.m2900a(getClass()).mo4496f(this);
                    }
/* 27 */            if (this.memoizedHashCode == 0) {
/* 29 */                cz1 cz1Var2 = cz1.f6940c;
/* 31 */                cz1Var2.getClass();
/* 46 */                this.memoizedHashCode = cz1Var2.m2900a(getClass()).mo4496f(this);
                    }
/* 48 */            return this.memoizedHashCode;
                }

                /* JADX INFO: renamed from: i */
                public final tq0 m8860i() {
/* 6 */             return (tq0) mo7066c(4);
                }

                /* JADX INFO: renamed from: k */
                public final void m8861k(int i) {
/* 1 */             if (i < 0) {
/* 22 */                f42.m3656l(fm0.m3781g(i, "serialized size must be non-negative, was "));
                    } else {
/* 13 */                this.memoizedSerializedSize = (i & AbstractC0208c9.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
                    }
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = ph1.f15122a;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            ph1.m7450c(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
