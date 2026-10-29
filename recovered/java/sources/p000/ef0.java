            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import kotlin.coroutines.CoroutineContext;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class ef0 extends ze0 implements g70 {

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ long f7661U;

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ long f7662V;

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f7663i = AtomicReferenceFieldUpdater.newUpdater(ef0.class, Object.class, "_queue$volatile");

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f7664v;

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f7665w;
                private volatile /* synthetic */ Object _delayed$volatile;
                private volatile /* synthetic */ int _isCompleted$volatile = 0;
                private volatile /* synthetic */ Object _queue$volatile;

                static {
/* 13 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */            f7662V = unsafe.objectFieldOffset(ef0.class.getDeclaredField("_queue$volatile"));
/* 31 */            f7664v = AtomicReferenceFieldUpdater.newUpdater(ef0.class, Object.class, "_delayed$volatile");
/* 41 */            f7661U = unsafe.objectFieldOffset(ef0.class.getDeclaredField("_delayed$volatile"));
/* 49 */            f7665w = AtomicIntegerFieldUpdater.newUpdater(ef0.class, "_isCompleted$volatile");
                }

                /* JADX INFO: renamed from: A */
                public void mo3411A(long j, cf0 cf0Var) {
/* 3 */             w50.f18442W.m3414E(j, cf0Var);
                }

                /* JADX INFO: renamed from: C */
                public final void m3412C() {
                    cf0 cf0VarM3532b;
/* 1 */             long jNanoTime = System.nanoTime();
                    while (true) {
/* 7 */                 f7664v.getClass();
/* 18 */                df0 df0Var = (df0) AbstractC1703b.f11726a.getObjectVolatile(this, f7661U);
/* 20 */                if (df0Var == null) {
/* 50 */                    return;
                        }
                        synchronized (df0Var) {
/* 39 */                    cf0VarM3532b = eo2.f7815b.get(df0Var) > 0 ? df0Var.m3532b(0) : null;
                        }
/* 41 */                if (cf0VarM3532b == null) {
/* 50 */                    return;
                        } else {
/* 44 */                    mo3411A(jNanoTime, cf0VarM3532b);
                        }
                    }
                }

                /* JADX INFO: renamed from: D */
                public final void m3413D() {
/* 3 */             f7663i.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 11 */            unsafe.putObjectVolatile(this, f7662V, (Object) null);
/* 16 */            f7664v.getClass();
/* 21 */            unsafe.putObjectVolatile(this, f7661U, (Object) null);
                }

                /* JADX INFO: renamed from: E */
                public final void m3414E(long j, cf0 cf0Var) {
                    Thread threadMo3425y;
/* 1 */             int iM3415F = m3415F(j, cf0Var);
/* 5 */             if (iM3415F == 0) {
/* 28 */                if (!m3416G(cf0Var) || Thread.currentThread() == (threadMo3425y = mo3425y())) {
/* 43 */                    return;
                        }
/* 40 */                LockSupport.unpark(threadMo3425y);
/* 43 */                return;
                    }
/* 8 */             if (iM3415F == 1) {
/* 20 */                mo3411A(j, cf0Var);
                    } else {
/* 11 */                if (iM3415F == 2) {
/* 43 */                    return;
                        }
/* 16 */                f42.m3656l("unexpected result");
                    }
                }

                /* JADX INFO: renamed from: F */
                public final int m3415F(long j, cf0 cf0Var) {
                    ef0 ef0Var;
                    Unsafe unsafe;
/* 7 */             if (f7665w.get(this) != 0) {
/* 9 */                 return 1;
                    }
/* 13 */            f7664v.getClass();
/* 16 */            Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 18 */            long j2 = f7661U;
/* 24 */            df0 df0Var = (df0) unsafe2.getObjectVolatile(this, j2);
/* 26 */            if (df0Var == null) {
/* 30 */                df0 df0Var2 = new df0();
/* 33 */                df0Var2.f7156c = j;
                        while (true) {
/* 35 */                    unsafe = AbstractC1703b.f11726a;
/* 40 */                    ef0Var = this;
/* 45 */                    if (unsafe.compareAndSwapObject(ef0Var, f7661U, (Object) null, df0Var2) || unsafe.getObjectVolatile(ef0Var, j2) != null) {
                                break;
                            }
/* 65 */                    this = ef0Var;
                        }
/* 54 */                Object objectVolatile = unsafe.getObjectVolatile(ef0Var, j2);
/* 58 */                objectVolatile.getClass();
/* 62 */                df0Var = (df0) objectVolatile;
                    } else {
/* 67 */                ef0Var = this;
                    }
/* 68 */            return cf0Var.m1650a(j, df0Var, ef0Var);
                }

                /* JADX INFO: renamed from: G */
                public final boolean m3416G(cf0 cf0Var) {
/* 3 */             f7664v.getClass();
/* 14 */            df0 df0Var = (df0) AbstractC1703b.f11726a.getObjectVolatile(this, f7661U);
/* 16 */            cf0 cf0Var2 = null;
/* 18 */            if (df0Var != null) {
                        synchronized (df0Var) {
/* 21 */                    cf0[] cf0VarArr = df0Var.f7816a;
/* 25 */                    cf0Var2 = cf0VarArr != null ? cf0VarArr[0] : null;
                        }
                    }
                    return cf0Var2 == cf0Var;
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: c */
                public e90 mo3417c(long j, mo2 mo2Var, CoroutineContext coroutineContext) {
/* 3 */             return x50.f18955a.mo3417c(j, mo2Var, coroutineContext);
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: f */
                public final void mo3418f(long j, C0890er c0890er) {
/* 1 */             long j2 = 0;
/* 5 */             if (j > 0) {
/* 26 */                j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
                    }
/* 34 */            if (j2 < 4611686018427387903L) {
/* 36 */                long jNanoTime = System.nanoTime();
/* 43 */                af0 af0Var = new af0(this, j2 + jNanoTime, c0890er);
/* 46 */                m3414E(jNanoTime, af0Var);
/* 55 */                c0890er.m3574x(new C2507yq(af0Var, 2));
                    }
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
/* 1 */             mo3422t(runnable);
                }

                @Override // p000.ze0
                /* JADX INFO: renamed from: o */
                public final long mo3419o() {
                    cf0 cf0VarM3532b;
/* 7 */             if (m10348p()) {
/* 5 */                 return 0L;
                    }
/* 12 */            f7664v.getClass();
/* 23 */            df0 df0Var = (df0) AbstractC1703b.f11726a.getObjectVolatile(this, f7661U);
/* 25 */            if (df0Var != null && eo2.f7815b.get(df0Var) != 0) {
/* 36 */                long jNanoTime = System.nanoTime();
/* 78 */                do {
                            synchronized (df0Var) {
                                try {
/* 41 */                            cf0[] cf0VarArr = df0Var.f7816a;
/* 43 */                            cf0VarM3532b = null;
/* 50 */                            cf0 cf0Var = cf0VarArr != null ? cf0VarArr[0] : null;
/* 51 */                            if (cf0Var != null) {
/* 73 */                                cf0VarM3532b = ((jNanoTime - cf0Var.f2872a) > 0L ? 1 : ((jNanoTime - cf0Var.f2872a) == 0L ? 0 : -1)) >= 0 ? m3423v(cf0Var) : false ? df0Var.m3532b(0) : null;
                                    }
                                } catch (Throwable th) {
/* 82 */                            throw th;
                                }
                            }
/* 78 */                } while (cf0VarM3532b != null);
                    }
/* 83 */            Runnable runnableM3421s = m3421s();
/* 87 */            if (runnableM3421s == null) {
/* 93 */                return m3424x();
                    }
/* 89 */            runnableM3421s.run();
/* 5 */             return 0L;
                }

                /* JADX INFO: renamed from: q */
                public final void m3420q() {
                    ef0 ef0Var;
                    Unsafe unsafe;
/* 1 */             C2131r4 c2131r4 = he3.f9035c;
                    while (true) {
/* 5 */                 f7663i.getClass();
/* 8 */                 Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 10 */                long j = f7662V;
/* 12 */                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
/* 16 */                if (objectVolatile == null) {
                            while (true) {
/* 18 */                        Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 23 */                        ef0Var = this;
/* 28 */                        if (unsafe3.compareAndSwapObject(ef0Var, f7662V, (Object) null, c2131r4)) {
/* 79 */                            return;
                                }
/* 35 */                        if (unsafe3.getObjectVolatile(ef0Var, j) != null) {
                                    break;
                                } else {
/* 38 */                            this = ef0Var;
                                }
                            }
                        } else {
/* 40 */                    ef0Var = this;
/* 43 */                    if (objectVolatile instanceof v91) {
/* 47 */                        ((v91) objectVolatile).m9235c();
/* 50 */                        return;
                            }
/* 51 */                    if (objectVolatile == c2131r4) {
/* 79 */                        return;
                            }
/* 59 */                    v91 v91Var = new v91(8, true);
/* 65 */                    v91Var.m9233a((Runnable) objectVolatile);
/* 84 */                    do {
/* 68 */                        unsafe = AbstractC1703b.f11726a;
/* 77 */                        if (unsafe.compareAndSwapObject(ef0Var, f7662V, objectVolatile, v91Var)) {
/* 79 */                            return;
                                }
/* 84 */                    } while (unsafe.getObjectVolatile(ef0Var, j) == objectVolatile);
                        }
/* 86 */                this = ef0Var;
                    }
                }

                /* JADX INFO: renamed from: s */
                public final Runnable m3421s() {
                    ef0 ef0Var;
                    Unsafe unsafe;
                    while (true) {
/* 3 */                 f7663i.getClass();
/* 6 */                 Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 8 */                 long j = f7662V;
/* 10 */                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
/* 14 */                if (objectVolatile == null) {
/* 65 */                    return null;
                        }
/* 19 */                if (objectVolatile instanceof v91) {
/* 22 */                    v91 v91Var = (v91) objectVolatile;
/* 24 */                    Object objM9237e = v91Var.m9237e();
/* 30 */                    if (objM9237e == v91.f17920g) {
/* 35 */                        v91 v91VarM9236d = v91Var.m9236d();
                                while (true) {
/* 39 */                            Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 43 */                            ef0Var = this;
/* 48 */                            if (unsafe3.compareAndSwapObject(ef0Var, f7662V, objectVolatile, v91VarM9236d) || unsafe3.getObjectVolatile(ef0Var, j) != objectVolatile) {
                                        break;
                                    }
/* 58 */                            this = ef0Var;
                                }
                            } else {
/* 32 */                        return (Runnable) objM9237e;
                            }
                        } else {
/* 60 */                    ef0Var = this;
/* 63 */                    if (objectVolatile == he3.f9035c) {
/* 65 */                        return null;
                            }
/* 85 */                    do {
/* 67 */                        unsafe = AbstractC1703b.f11726a;
/* 76 */                        if (unsafe.compareAndSwapObject(ef0Var, f7662V, objectVolatile, (Object) null)) {
/* 78 */                            return (Runnable) objectVolatile;
                                }
/* 85 */                    } while (unsafe.getObjectVolatile(ef0Var, j) == objectVolatile);
                        }
/* 87 */                this = ef0Var;
                    }
                }

                @Override // p000.ze0
                public void shutdown() {
/* 4 */             do2.f7352a.set(null);
/* 10 */            f7665w.set(this, 1);
/* 13 */            m3420q();
/* 24 */            while (mo3419o() <= 0) {
                    }
/* 26 */            m3412C();
                }

                /* JADX INFO: renamed from: t */
                public void mo3422t(Runnable runnable) {
/* 5 */             if (!m3423v(runnable)) {
/* 23 */                w50.f18442W.mo3422t(runnable);
/* 26 */                return;
                    }
/* 7 */             Thread threadMo3425y = mo3425y();
/* 15 */            if (Thread.currentThread() != threadMo3425y) {
/* 17 */                LockSupport.unpark(threadMo3425y);
                    }
                }

                /* JADX INFO: renamed from: v */
                public final boolean m3423v(Runnable runnable) {
                    ef0 ef0Var;
                    Runnable runnable2;
                    Unsafe unsafe;
                    Unsafe unsafe2;
                    while (true) {
/* 3 */                 f7663i.getClass();
/* 6 */                 Unsafe unsafe3 = AbstractC1703b.f11726a;
/* 8 */                 long j = f7662V;
/* 10 */                Object objectVolatile = unsafe3.getObjectVolatile(this, j);
/* 21 */                if (f7665w.get(this) != 0) {
/* 20 */                    return false;
                        }
/* 25 */                if (objectVolatile == null) {
                            while (true) {
/* 27 */                        Unsafe unsafe4 = AbstractC1703b.f11726a;
/* 32 */                        ef0 ef0Var2 = this;
/* 33 */                        runnable2 = runnable;
/* 38 */                        ef0Var = ef0Var2;
/* 39 */                        if (unsafe4.compareAndSwapObject(ef0Var2, f7662V, (Object) null, runnable2)) {
/* 24 */                            return true;
                                }
/* 46 */                        if (unsafe4.getObjectVolatile(ef0Var, j) != null) {
                                    break;
                                }
/* 49 */                        this = ef0Var;
/* 50 */                        runnable = runnable2;
                            }
/* 133 */                   this = ef0Var;
/* 134 */                   runnable = runnable2;
                        } else {
/* 52 */                    ef0Var = this;
/* 53 */                    runnable2 = runnable;
/* 56 */                    if (objectVolatile instanceof v91) {
/* 59 */                        v91 v91Var = (v91) objectVolatile;
/* 61 */                        int iM9233a = v91Var.m9233a(runnable2);
/* 65 */                        if (iM9233a == 0) {
/* 24 */                            return true;
                                }
/* 67 */                        if (iM9233a == 1) {
/* 73 */                            v91 v91VarM9236d = v91Var.m9236d();
/* 92 */                            do {
/* 77 */                                unsafe2 = AbstractC1703b.f11726a;
/* 85 */                                if (unsafe2.compareAndSwapObject(ef0Var, f7662V, objectVolatile, v91VarM9236d)) {
                                            break;
                                        }
/* 92 */                            } while (unsafe2.getObjectVolatile(ef0Var, j) == objectVolatile);
                                } else if (iM9233a == 2) {
/* 20 */                            return false;
                                }
/* 133 */                       this = ef0Var;
/* 134 */                       runnable = runnable2;
                            } else {
/* 97 */                        if (objectVolatile == he3.f9035c) {
/* 20 */                            return false;
                                }
/* 104 */                       v91 v91Var2 = new v91(8, true);
/* 110 */                       v91Var2.m9233a((Runnable) objectVolatile);
/* 113 */                       v91Var2.m9233a(runnable2);
/* 131 */                       do {
/* 116 */                           unsafe = AbstractC1703b.f11726a;
/* 124 */                           if (unsafe.compareAndSwapObject(ef0Var, f7662V, objectVolatile, v91Var2)) {
/* 24 */                                return true;
                                    }
/* 131 */                       } while (unsafe.getObjectVolatile(ef0Var, j) == objectVolatile);
/* 133 */                       this = ef0Var;
/* 134 */                       runnable = runnable2;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: x */
                public final long m3424x() {
                    cf0 cf0Var;
/* 1 */             C0840dd c0840dd = this.f20124e;
/* 24 */            if (((c0840dd == null || c0840dd.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
/* 29 */                f7663i.getClass();
/* 32 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 36 */                Object objectVolatile = unsafe.getObjectVolatile(this, f7662V);
/* 40 */                if (objectVolatile != null) {
/* 44 */                    if (objectVolatile instanceof v91) {
/* 50 */                        long j = v91.f17919f.get((v91) objectVolatile);
/* 69 */                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
/* 3 */                             return 0L;
                                }
                            } else if (objectVolatile == he3.f9035c) {
/* 5 */                         return Long.MAX_VALUE;
                            }
                        }
/* 80 */                f7664v.getClass();
/* 89 */                df0 df0Var = (df0) unsafe.getObjectVolatile(this, f7661U);
/* 91 */                if (df0Var != null) {
                            synchronized (df0Var) {
/* 94 */                        cf0[] cf0VarArr = df0Var.f7816a;
/* 104 */                       cf0Var = cf0VarArr != null ? cf0VarArr[0] : null;
                            }
/* 106 */                   if (cf0Var != null) {
/* 115 */                       long jNanoTime = cf0Var.f2872a - System.nanoTime();
/* 118 */                       if (jNanoTime >= 0) {
/* 121 */                           return jNanoTime;
                                }
                            }
                        }
/* 5 */                 return Long.MAX_VALUE;
                    }
/* 3 */             return 0L;
                }

                /* JADX INFO: renamed from: y */
                public abstract Thread mo3425y();

                /* JADX INFO: renamed from: z */
                public final boolean m3426z() {
/* 1 */             C0840dd c0840dd = this.f20124e;
/* 13 */            if (c0840dd != null ? c0840dd.isEmpty() : true) {
/* 18 */                f7664v.getClass();
/* 21 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 29 */                df0 df0Var = (df0) unsafe.getObjectVolatile(this, f7661U);
/* 31 */                if (df0Var != null && eo2.f7815b.get(df0Var) != 0) {
/* 12 */                    return false;
                        }
/* 45 */                f7663i.getClass();
/* 50 */                Object objectVolatile = unsafe.getObjectVolatile(this, f7662V);
/* 54 */                if (objectVolatile != null) {
/* 59 */                    if (objectVolatile instanceof v91) {
/* 65 */                        long j = v91.f17919f.get((v91) objectVolatile);
                                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                            }
/* 90 */                    if (objectVolatile == he3.f9035c) {
                            }
                        }
/* 3 */                 return true;
                    }
/* 12 */            return false;
                }
            }
