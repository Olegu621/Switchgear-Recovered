            package p000;

            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class sq0 extends AbstractC2313w {
                private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
                private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
                static final int UNINITIALIZED_HASH_CODE = 0;
                static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
                private static Map<Object, sq0> defaultInstanceMap = new ConcurrentHashMap();
                private int memoizedSerializedSize;
                protected rx2 unknownFields;

                public sq0() {
/* 5 */             this.memoizedHashCode = 0;
/* 8 */             this.memoizedSerializedSize = -1;
/* 12 */            this.unknownFields = rx2.f16339f;
                }

                /* JADX INFO: renamed from: g */
                public static void m8608g(sq0 sq0Var) throws pz0 {
/* 6 */             if (!m8611m(sq0Var, true)) {
/* 23 */                throw new pz0(new mx2().getMessage());
                    }
                }

                /* JADX INFO: renamed from: j */
                public static sq0 m8609j(Class cls) {
/* 3 */             sq0 sq0Var = defaultInstanceMap.get(cls);
/* 9 */             if (sq0Var == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 25 */                    sq0Var = defaultInstanceMap.get(cls);
                        } catch (ClassNotFoundException e) {
/* 40 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 41 */            if (sq0Var != null) {
/* 66 */                return sq0Var;
                    }
/* 49 */            sq0 sq0VarMo1421a = ((sq0) my2.m6816b(cls)).mo1421a();
/* 53 */            if (sq0VarMo1421a != null) {
/* 57 */                defaultInstanceMap.put(cls, sq0VarMo1421a);
/* 60 */                return sq0VarMo1421a;
                    }
/* 61 */            f42.m3664t();
/* 64 */            return null;
                }

                /* JADX INFO: renamed from: l */
                public static Object m8610l(Method method, sq0 sq0Var, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(sq0Var, objArr);
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

                /* JADX INFO: renamed from: m */
                public static final boolean m8611m(sq0 sq0Var, boolean z) {
/* 8 */             byte bByteValue = ((Byte) sq0Var.mo54i(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 19 */            az1 az1Var = az1.f2145c;
/* 21 */            az1Var.getClass();
/* 32 */            boolean zMo4125c = az1Var.m1182a(sq0Var.getClass()).mo4125c(sq0Var);
/* 36 */            if (z) {
/* 39 */                sq0Var.mo54i(2);
                    }
/* 42 */            return zMo4125c;
                }

                /* JADX INFO: renamed from: r */
                public static sq0 m8612r(sq0 sq0Var, AbstractC2298vl abstractC2298vl, dg0 dg0Var) throws pz0 {
/* 1 */             C2222tl c2222tl = (C2222tl) abstractC2298vl;
/* 14 */            C0858dw c0858dwM4386h = AbstractC1006hw.m4386h(c2222tl.f17140d, c2222tl.mo8196f(), c2222tl.size(), true);
/* 18 */            sq0 sq0VarM8613s = m8613s(sq0Var, c0858dwM4386h, dg0Var);
/* 23 */            c0858dwM4386h.mo3255b(0);
/* 26 */            m8608g(sq0VarM8613s);
/* 29 */            return sq0VarM8613s;
                }

                /* JADX INFO: renamed from: s */
                public static sq0 m8613s(sq0 sq0Var, AbstractC1006hw abstractC1006hw, dg0 dg0Var) throws pz0 {
/* 1 */             sq0 sq0VarM8623q = sq0Var.m8623q();
                    try {
/* 5 */                 az1 az1Var = az1.f2145c;
/* 7 */                 az1Var.getClass();
/* 14 */                h72 h72VarM1182a = az1Var.m1182a(sq0VarM8623q.getClass());
/* 20 */                C1771iw c1771iw = (C1771iw) abstractC1006hw.f9337b;
/* 22 */                if (c1771iw == null) {
/* 27 */                    c1771iw = new C1771iw(abstractC1006hw);
                        }
/* 30 */                h72VarM1182a.mo4129g(sq0VarM8623q, c1771iw, dg0Var);
/* 33 */                h72VarM1182a.mo4124b(sq0VarM8623q);
/* 36 */                return sq0VarM8623q;
                    } catch (pz0 e) {
/* 94 */                if (e.f15349a) {
/* 106 */                   throw new pz0(e.getMessage(), e);
                        }
/* 106 */               throw e;
                    } catch (IOException e2) {
/* 61 */                if (e2.getCause() instanceof pz0) {
/* 69 */                    throw ((pz0) e2.getCause());
                        }
/* 79 */                throw new pz0(e2.getMessage(), e2);
                    } catch (mx2 e3) {
/* 90 */                throw new pz0(e3.getMessage());
                    } catch (RuntimeException e4) {
/* 44 */                if (e4.getCause() instanceof pz0) {
/* 52 */                    throw ((pz0) e4.getCause());
                        }
/* 53 */                throw e4;
                    }
                }

                /* JADX INFO: renamed from: t */
                public static void m8614t(Class cls, sq0 sq0Var) {
/* 1 */             sq0Var.m8621o();
/* 6 */             defaultInstanceMap.put(cls, sq0Var);
                }

                @Override // p000.AbstractC2313w
                /* JADX INFO: renamed from: b */
                public final int mo8615b(h72 h72Var) {
                    int iMo4126d;
                    int iMo4126d2;
/* 5 */             if (m8620n()) {
/* 7 */                 if (h72Var == null) {
/* 9 */                     az1 az1Var = az1.f2145c;
/* 11 */                    az1Var.getClass();
/* 22 */                    iMo4126d2 = az1Var.m1182a(getClass()).mo4126d(this);
                        } else {
/* 27 */                    iMo4126d2 = h72Var.mo4126d(this);
                        }
/* 31 */                if (iMo4126d2 >= 0) {
/* 33 */                    return iMo4126d2;
                        }
/* 40 */                f42.m3656l(fm0.m3781g(iMo4126d2, "serialized size must be non-negative, was "));
/* 43 */                return 0;
                    }
/* 45 */            int i = this.memoizedSerializedSize;
/* 52 */            if ((i & AbstractC0208c9.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
/* 54 */                return i & AbstractC0208c9.API_PRIORITY_OTHER;
                    }
/* 57 */            if (h72Var == null) {
/* 59 */                az1 az1Var2 = az1.f2145c;
/* 61 */                az1Var2.getClass();
/* 72 */                iMo4126d = az1Var2.m1182a(getClass()).mo4126d(this);
                    } else {
/* 77 */                iMo4126d = h72Var.mo4126d(this);
                    }
/* 81 */            m8624u(iMo4126d);
/* 84 */            return iMo4126d;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 20 */            az1 az1Var = az1.f2145c;
/* 22 */            az1Var.getClass();
/* 35 */            return az1Var.m1182a(getClass()).mo4131i(this, (sq0) obj);
                }

                @Override // p000.AbstractC2313w
                /* JADX INFO: renamed from: f */
                public final void mo8617f(C1808jw c1808jw) {
/* 1 */             az1 az1Var = az1.f2145c;
/* 3 */             az1Var.getClass();
/* 10 */            h72 h72VarM1182a = az1Var.m1182a(getClass());
/* 14 */            d52 d52Var = c1808jw.f12513a;
/* 16 */            if (d52Var == null) {
/* 21 */                d52Var = new d52();
/* 26 */                ez0.m3614a(c1808jw, "output");
/* 29 */                d52Var.f7001a = c1808jw;
/* 31 */                c1808jw.f12513a = d52Var;
                    }
/* 33 */            h72VarM1182a.mo4127e(this, d52Var);
                }

                /* JADX INFO: renamed from: h */
                public final oq0 m8618h() {
/* 6 */             return (oq0) mo54i(5);
                }

                public final int hashCode() {
/* 5 */             if (m8620n()) {
/* 7 */                 az1 az1Var = az1.f2145c;
/* 9 */                 az1Var.getClass();
/* 20 */                return az1Var.m1182a(getClass()).mo4128f(this);
                    }
/* 27 */            if (this.memoizedHashCode == 0) {
/* 29 */                az1 az1Var2 = az1.f2145c;
/* 31 */                az1Var2.getClass();
/* 46 */                this.memoizedHashCode = az1Var2.m1182a(getClass()).mo4128f(this);
                    }
/* 48 */            return this.memoizedHashCode;
                }

                /* JADX INFO: renamed from: i */
                public abstract Object mo54i(int i);

                @Override // p000.nh1
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final sq0 mo1421a() {
/* 6 */             return (sq0) mo54i(6);
                }

                /* JADX INFO: renamed from: n */
                public final boolean m8620n() {
                    return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
                }

                /* JADX INFO: renamed from: o */
                public final void m8621o() {
/* 7 */             this.memoizedSerializedSize &= AbstractC0208c9.API_PRIORITY_OTHER;
                }

                @Override // p000.AbstractC2313w
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public final oq0 mo8616d() {
/* 6 */             return (oq0) mo54i(5);
                }

                /* JADX INFO: renamed from: q */
                public final sq0 m8623q() {
/* 6 */             return (sq0) mo54i(4);
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = oh1.f14754a;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            oh1.m7173c(this, sb, 0);
/* 24 */            return sb.toString();
                }

                /* JADX INFO: renamed from: u */
                public final void m8624u(int i) {
/* 1 */             if (i < 0) {
/* 22 */                f42.m3656l(fm0.m3781g(i, "serialized size must be non-negative, was "));
                    } else {
/* 13 */                this.memoizedSerializedSize = (i & AbstractC0208c9.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
                    }
                }

                /* JADX INFO: renamed from: v */
                public final oq0 m8625v() {
/* 6 */             oq0 oq0Var = (oq0) mo54i(5);
/* 14 */            if (!oq0Var.f14863a.equals(this)) {
/* 17 */                oq0Var.m7234e();
/* 22 */                oq0.m7230f(oq0Var.f14864b, this);
                    }
/* 25 */            return oq0Var;
                }
            }
