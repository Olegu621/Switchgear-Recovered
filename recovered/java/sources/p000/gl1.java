            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class gl1 extends j92 implements dl1 {

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f8697i = AtomicReferenceFieldUpdater.newUpdater(gl1.class, Object.class, "owner$volatile");

                /* JADX INFO: renamed from: j */
                public static final /* synthetic */ long f8698j = AbstractC1703b.f11726a.objectFieldOffset(gl1.class.getDeclaredField("owner$volatile"));
                private volatile /* synthetic */ Object owner$volatile = py0.f15332f;

                /* JADX INFO: renamed from: d */
                public final Object m3967d(d10 d10Var) {
/* 5 */             if (m3968e()) {
/* 7 */                 return Unit.f12910a;
                    }
/* 14 */            C0890er c0890erM7912w = qj3.m7912w(mz0.m6834b(d10Var));
                    try {
/* 20 */                fl1 fl1Var = new fl1(this, c0890erM7912w);
                        while (true) {
/* 25 */                    int andDecrement = j92.f12155f.getAndDecrement(this);
/* 30 */                    if (andDecrement <= 1) {
/* 32 */                        if (andDecrement > 0) {
/* 38 */                            fl1Var.mo3179d(Unit.f12910a, this.f12158a);
                                    break;
                                }
/* 46 */                        if (m5728a(fl1Var)) {
                                    break;
                                }
                            }
                        }
/* 48 */                Object objM3569s = c0890erM7912w.m3569s();
/* 52 */                z10 z10Var = z10.f19902a;
/* 54 */                if (objM3569s != z10Var) {
/* 57 */                    objM3569s = Unit.f12910a;
                        }
                        return objM3569s == z10Var ? objM3569s : Unit.f12910a;
                    } catch (Throwable th) {
/* 66 */                c0890erM7912w.m3550B();
/* 69 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m3968e() {
/* 1 */             int iM3969f = m3969f();
/* 6 */             if (iM3969f == 0) {
/* 5 */                 return true;
                    }
/* 8 */             if (iM3969f == 1) {
/* 26 */                return false;
                    }
/* 11 */            if (iM3969f != 2) {
/* 15 */                f42.m3656l("unexpected");
/* 18 */                return false;
                    }
/* 22 */            ds0.m3190g("This mutex is already locked by the specified owner: null");
/* 18 */            return false;
                }

                /* JADX INFO: renamed from: f */
                public final int m3969f() {
                    int i;
                    while (true) {
/* 1 */                 AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j92.f12155f;
/* 3 */                 int i2 = atomicIntegerFieldUpdater.get(this);
/* 8 */                 if (i2 > 1) {
/* 20 */                    do {
/* 10 */                        i = atomicIntegerFieldUpdater.get(this);
/* 14 */                        if (i <= 1) {
                                    break;
                                }
/* 20 */                    } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                        } else {
/* 23 */                    if (i2 <= 0) {
/* 7 */                         return 1;
                            }
/* 32 */                    if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
/* 36 */                        f8697i.getClass();
/* 44 */                        AbstractC1703b.f11726a.putObjectVolatile(this, f8698j, (Object) null);
/* 47 */                        return 0;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m3970g(Object obj) {
/* 12 */            while (Math.max(j92.f12155f.get(this), 0) == 0) {
/* 16 */                f8697i.getClass();
/* 19 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 21 */                long j = f8698j;
/* 23 */                Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 27 */                C2131r4 c2131r4 = py0.f15332f;
/* 29 */                if (objectVolatile != c2131r4) {
/* 31 */                    if (objectVolatile != obj && obj != null) {
/* 72 */                        throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                            }
                            while (true) {
/* 73 */                        Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 77 */                        gl1 gl1Var = this;
/* 82 */                        if (unsafe2.compareAndSwapObject(gl1Var, f8698j, objectVolatile, c2131r4)) {
/* 84 */                            gl1Var.m5729b();
/* 87 */                            return;
                                } else {
/* 92 */                            if (unsafe2.getObjectVolatile(gl1Var, j) != objectVolatile) {
/* 94 */                                this = gl1Var;
                                        break;
                                    }
/* 96 */                            this = gl1Var;
                                }
                            }
                        }
                    }
/* 100 */           f42.m3656l("This mutex is not locked");
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Mutex@");
/* 12 */            sb.append(k50.m5983t(this));
/* 17 */            sb.append("[isLocked=");
/* 34 */            sb.append(Math.max(j92.f12155f.get(this), 0) == 0);
/* 39 */            sb.append(",owner=");
/* 44 */            f8697i.getClass();
/* 55 */            sb.append(AbstractC1703b.f11726a.getObjectVolatile(this, f8698j));
/* 60 */            sb.append(']');
/* 63 */            return sb.toString();
                }
            }
