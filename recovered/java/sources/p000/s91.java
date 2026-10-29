            package p000;

            import io.sentry.C1697u2;
            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class s91 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16475a = AtomicReferenceFieldUpdater.newUpdater(s91.class, Object.class, "_next$volatile");

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16476b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16477c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ long f16478d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ long f16479e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ long f16480f;
                private volatile /* synthetic */ Object _next$volatile = this;
                private volatile /* synthetic */ Object _prev$volatile = this;
                private volatile /* synthetic */ Object _removedRef$volatile;

                static {
/* 13 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */            f16478d = unsafe.objectFieldOffset(s91.class.getDeclaredField("_next$volatile"));
/* 31 */            f16476b = AtomicReferenceFieldUpdater.newUpdater(s91.class, Object.class, "_prev$volatile");
/* 41 */            f16479e = unsafe.objectFieldOffset(s91.class.getDeclaredField("_prev$volatile"));
/* 49 */            f16477c = AtomicReferenceFieldUpdater.newUpdater(s91.class, Object.class, "_removedRef$volatile");
/* 59 */            f16480f = unsafe.objectFieldOffset(s91.class.getDeclaredField("_removedRef$volatile"));
                }

                /* JADX INFO: renamed from: f */
                public static s91 m8450f(s91 s91Var) {
/* 5 */             while (s91Var.mo7955k()) {
/* 10 */                f16476b.getClass();
/* 21 */                s91Var = (s91) AbstractC1703b.f11726a.getObjectVolatile(s91Var, f16479e);
                    }
/* 7 */             return s91Var;
                }

                /* JADX INFO: renamed from: d */
                public final void m8451d(qn1 qn1Var) {
                    s91 s91Var;
                    qn1 qn1Var2;
/* 3 */             f16476b.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */            unsafe.putObjectVolatile(qn1Var, f16479e, this);
/* 15 */            f16475a.getClass();
/* 18 */            long j = f16478d;
/* 20 */            unsafe.putObjectVolatile(qn1Var, j, this);
/* 27 */            while (this.m8454h() == this) {
                        while (true) {
/* 30 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 35 */                    s91Var = this;
/* 36 */                    qn1Var2 = qn1Var;
/* 41 */                    if (unsafe2.compareAndSwapObject(s91Var, f16478d, this, qn1Var2)) {
/* 43 */                        qn1Var2.m8453g(s91Var);
/* 46 */                        return;
                            } else {
/* 51 */                        if (unsafe2.getObjectVolatile(s91Var, j) != s91Var) {
                                    break;
                                }
/* 56 */                        this = s91Var;
/* 57 */                        qn1Var = qn1Var2;
                            }
                        }
/* 53 */                this = s91Var;
/* 54 */                qn1Var = qn1Var2;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final s91 m8452e() {
                    while (true) {
/* 3 */                 f16476b.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f16479e;
/* 15 */                s91 s91Var = (s91) unsafe.getObjectVolatile(this, j);
/* 18 */                s91 s91Var2 = null;
/* 19 */                s91 s91Var3 = s91Var;
                        while (true) {
/* 22 */                    f16475a.getClass();
/* 25 */                    if (s91Var3 == null) {
/* 147 */                       C1697u2.m5431g();
/* 17 */                        return null;
                            }
/* 27 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 29 */                    long j2 = f16478d;
/* 31 */                    Object objectVolatile = unsafe2.getObjectVolatile(s91Var3, j2);
/* 35 */                    if (objectVolatile == this) {
/* 37 */                        if (s91Var != s91Var3) {
                                    while (true) {
/* 40 */                                Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 44 */                                s91 s91Var4 = this;
/* 45 */                                boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(s91Var4, f16479e, s91Var, s91Var3);
/* 49 */                                s91 s91Var5 = s91Var;
/* 50 */                                this = s91Var4;
/* 51 */                                if (!zCompareAndSwapObject) {
/* 58 */                                    if (unsafe3.getObjectVolatile(this, j) != s91Var5) {
                                                break;
                                            }
/* 62 */                                    this = this;
/* 63 */                                    s91Var = s91Var5;
                                        }
                                    }
                                }
/* 76 */                        return s91Var3;
                            }
/* 65 */                    s91Var = s91Var;
/* 66 */                    this = this;
/* 71 */                    if (this.mo7955k()) {
/* 17 */                        return null;
                            }
/* 74 */                    if (objectVolatile == null) {
/* 76 */                        return s91Var3;
                            }
/* 79 */                    if (objectVolatile instanceof AbstractC2364xd) {
/* 83 */                        ((AbstractC2364xd) objectVolatile).m9750c(s91Var3);
                                break;
                            }
/* 89 */                    if (!(objectVolatile instanceof h32)) {
/* 138 */                       objectVolatile.getClass();
/* 144 */                       s91Var2 = s91Var3;
/* 142 */                       s91Var3 = (s91) objectVolatile;
                            } else if (s91Var2 != null) {
/* 95 */                        s91 s91Var6 = ((h32) objectVolatile).f8889a;
                                while (true) {
/* 97 */                            s91 s91Var7 = s91Var3;
/* 98 */                            Unsafe unsafe4 = AbstractC1703b.f11726a;
/* 102 */                           boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(s91Var2, f16478d, s91Var7, s91Var6);
/* 107 */                           s91Var3 = s91Var7;
/* 108 */                           if (zCompareAndSwapObject2) {
/* 111 */                               s91Var3 = s91Var2;
/* 113 */                               s91Var2 = null;
                                        break;
                                    }
/* 119 */                           if (unsafe4.getObjectVolatile(s91Var2, j2) != s91Var3) {
                                        break;
                                    }
                                }
                            } else {
/* 122 */                       if (s91Var3 == null) {
/* 134 */                           C1697u2.m5431g();
/* 17 */                            return null;
                                }
/* 129 */                       s91Var3 = (s91) unsafe2.getObjectVolatile(s91Var3, j);
                            }
                        }
/* 60 */                this = this;
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m8453g(s91 s91Var) {
                    s91 s91Var2;
                    while (true) {
/* 3 */                 f16476b.getClass();
/* 6 */                 if (s91Var == null) {
/* 71 */                    C1697u2.m5431g();
/* 74 */                    return;
                        }
/* 8 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */                long j = f16479e;
/* 17 */                s91 s91Var3 = (s91) unsafe.getObjectVolatile(s91Var, j);
/* 23 */                if (this.m8454h() != s91Var) {
/* 49 */                    return;
                        }
                        while (true) {
/* 26 */                    if (s91Var == null) {
/* 67 */                        C1697u2.m5431g();
/* 70 */                        return;
                            }
/* 28 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 32 */                    s91Var2 = this;
/* 33 */                    s91 s91Var4 = s91Var;
/* 38 */                    if (unsafe2.compareAndSwapObject(s91Var4, f16479e, s91Var3, s91Var2)) {
/* 44 */                        if (s91Var2.mo7955k()) {
/* 46 */                            s91Var4.m8452e();
/* 49 */                            return;
                                }
/* 49 */                        return;
                            } else {
/* 50 */                        if (s91Var4 == null) {
/* 63 */                            C1697u2.m5431g();
/* 66 */                            return;
                                }
/* 56 */                        s91Var = s91Var4;
/* 57 */                        if (unsafe2.getObjectVolatile(s91Var4, j) != s91Var3) {
                                    break;
                                } else {
/* 61 */                            this = s91Var2;
                                }
                            }
                        }
/* 59 */                this = s91Var2;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final Object m8454h() {
                    while (true) {
/* 3 */                 f16475a.getClass();
/* 10 */                Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(this, f16478d);
/* 16 */                if (!(objectVolatile instanceof AbstractC2364xd)) {
/* 18 */                    return objectVolatile;
                        }
/* 21 */                ((AbstractC2364xd) objectVolatile).m9750c(this);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final s91 m8455i() {
/* 1 */             Object objM8454h = m8454h();
/* 13 */            h32 h32Var = objM8454h instanceof h32 ? (h32) objM8454h : null;
/* 14 */            if (h32Var != null) {
/* 16 */                return h32Var.f8889a;
                    }
/* 19 */            objM8454h.getClass();
/* 22 */            return (s91) objM8454h;
                }

                /* JADX INFO: renamed from: j */
                public final s91 m8456j() {
/* 1 */             s91 s91VarM8452e = m8452e();
/* 5 */             if (s91VarM8452e != null) {
/* 27 */                return s91VarM8452e;
                    }
/* 9 */             f16476b.getClass();
/* 22 */            return m8450f((s91) AbstractC1703b.f11726a.getObjectVolatile(this, f16479e));
                }

                /* JADX INFO: renamed from: k */
                public boolean mo7955k() {
/* 5 */             return m8454h() instanceof h32;
                }

                /* JADX INFO: renamed from: l */
                public final s91 m8457l() {
                    s91 s91Var;
                    while (true) {
/* 1 */                 Object objM8454h = this.m8454h();
/* 7 */                 if (objM8454h instanceof h32) {
/* 11 */                    return ((h32) objM8454h).f8889a;
                        }
/* 14 */                if (objM8454h == this) {
/* 16 */                    return (s91) objM8454h;
                        }
/* 19 */                objM8454h.getClass();
/* 23 */                s91 s91Var2 = (s91) objM8454h;
/* 25 */                h32 h32VarM8458m = s91Var2.m8458m();
                        while (true) {
/* 31 */                    f16475a.getClass();
/* 34 */                    Unsafe unsafe = AbstractC1703b.f11726a;
/* 36 */                    long j = f16478d;
/* 38 */                    s91Var = this;
/* 43 */                    if (unsafe.compareAndSwapObject(s91Var, j, objM8454h, h32VarM8458m)) {
/* 45 */                        s91Var2.m8452e();
/* 48 */                        return null;
                            }
/* 54 */                    if (unsafe.getObjectVolatile(s91Var, j) != objM8454h) {
                                break;
                            }
/* 58 */                    this = s91Var;
                        }
/* 56 */                this = s91Var;
                    }
                }

                /* JADX INFO: renamed from: m */
                public final h32 m8458m() {
/* 3 */             f16477c.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */             long j = f16480f;
/* 14 */            h32 h32Var = (h32) unsafe.getObjectVolatile(this, j);
/* 16 */            if (h32Var != null) {
/* 26 */                return h32Var;
                    }
/* 20 */            h32 h32Var2 = new h32(this);
/* 23 */            unsafe.putObjectVolatile(this, j, h32Var2);
/* 26 */            return h32Var2;
                }

                /* JADX INFO: renamed from: n */
                public final int m8459n(o01 o01Var, qn1 qn1Var, u01 u01Var) {
/* 3 */             f16476b.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 10 */            unsafe.putObjectVolatile(o01Var, f16479e, this);
/* 15 */            f16475a.getClass();
/* 18 */            long j = f16478d;
/* 20 */            unsafe.putObjectVolatile(o01Var, j, qn1Var);
/* 23 */            u01Var.f17323d = qn1Var;
                    while (true) {
/* 25 */                Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 29 */                s91 s91Var = this;
/* 30 */                qn1 qn1Var2 = qn1Var;
/* 31 */                u01 u01Var2 = u01Var;
/* 36 */                if (unsafe2.compareAndSwapObject(s91Var, f16478d, qn1Var2, u01Var2)) {
                            return u01Var2.m9750c(s91Var) == null ? 1 : 2;
                        }
/* 52 */                if (unsafe2.getObjectVolatile(s91Var, j) != qn1Var2) {
/* 54 */                    return 0;
                        }
/* 56 */                this = s91Var;
/* 57 */                qn1Var = qn1Var2;
/* 58 */                u01Var = u01Var2;
                    }
                }

                public String toString() {
/* 34 */            return new r91(this, k50.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + k50.m5983t(this);
                }
            }
