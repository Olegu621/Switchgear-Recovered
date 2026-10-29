            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class e93 {

                /* JADX INFO: renamed from: a */
                public final AtomicReferenceArray f7589a = new AtomicReferenceArray(128);
                private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
                private volatile /* synthetic */ int consumerIndex$volatile;
                private volatile /* synthetic */ Object lastScheduledTask$volatile;
                private volatile /* synthetic */ int producerIndex$volatile;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f7584b = AtomicReferenceFieldUpdater.newUpdater(e93.class, Object.class, "lastScheduledTask$volatile");

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ long f7588f = AbstractC1703b.f11726a.objectFieldOffset(e93.class.getDeclaredField("lastScheduledTask$volatile"));

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f7585c = AtomicIntegerFieldUpdater.newUpdater(e93.class, "producerIndex$volatile");

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f7586d = AtomicIntegerFieldUpdater.newUpdater(e93.class, "consumerIndex$volatile");

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f7587e = AtomicIntegerFieldUpdater.newUpdater(e93.class, "blockingTasksInBuffer$volatile");

                /* JADX INFO: renamed from: a */
                public final sm2 m3345a(sm2 sm2Var, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return m3346b(sm2Var);
                    }
/* 10 */            f7584b.getClass();
/* 21 */            sm2 sm2Var2 = (sm2) AbstractC1703b.f11726a.getAndSetObject(this, f7588f, sm2Var);
/* 23 */            if (sm2Var2 == null) {
/* 25 */                return null;
                    }
/* 27 */            return m3346b(sm2Var2);
                }

                /* JADX INFO: renamed from: b */
                public final sm2 m3346b(sm2 sm2Var) {
/* 1 */             AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7585c;
/* 16 */            if (atomicIntegerFieldUpdater.get(this) - f7586d.get(this) == 127) {
/* 18 */                return sm2Var;
                    }
/* 24 */            if (sm2Var.f16707b.f18250a == 1) {
/* 28 */                f7587e.incrementAndGet(this);
                    }
/* 35 */            int i = atomicIntegerFieldUpdater.get(this) & 127;
                    while (true) {
/* 36 */                AtomicReferenceArray atomicReferenceArray = this.f7589a;
/* 42 */                if (atomicReferenceArray.get(i) == null) {
/* 48 */                    atomicReferenceArray.lazySet(i, sm2Var);
/* 51 */                    atomicIntegerFieldUpdater.incrementAndGet(this);
/* 54 */                    return null;
                        }
/* 44 */                Thread.yield();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final int m3347c() {
/* 3 */             f7584b.getClass();
/* 10 */            Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(this, f7588f);
/* 14 */            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7586d;
/* 16 */            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f7585c;
                    return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
                }

                /* JADX INFO: renamed from: d */
                public final void m3348d(ir0 ir0Var) {
/* 3 */             f7584b.getClass();
/* 15 */            sm2 sm2Var = (sm2) AbstractC1703b.f11726a.getAndSetObject(this, f7588f, (Object) null);
/* 17 */            if (sm2Var != null) {
/* 19 */                ir0Var.m8740a(sm2Var);
                    }
                    while (true) {
/* 22 */                sm2 sm2VarM3350f = m3350f();
/* 26 */                if (sm2VarM3350f == null) {
/* 28 */                    return;
                        } else {
/* 29 */                    ir0Var.m8740a(sm2VarM3350f);
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final sm2 m3349e() {
/* 3 */             f7584b.getClass();
/* 15 */            sm2 sm2Var = (sm2) AbstractC1703b.f11726a.getAndSetObject(this, f7588f, (Object) null);
                    return sm2Var == null ? m3350f() : sm2Var;
                }

                /* JADX INFO: renamed from: f */
                public final sm2 m3350f() {
                    sm2 sm2Var;
                    while (true) {
/* 1 */                 AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7586d;
/* 3 */                 int i = atomicIntegerFieldUpdater.get(this);
/* 16 */                if (i - f7585c.get(this) == 0) {
/* 15 */                    return null;
                        }
/* 19 */                int i2 = i & 127;
/* 27 */                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (sm2Var = (sm2) this.f7589a.getAndSet(i2, null)) != null) {
/* 45 */                    if (sm2Var.f16707b.f18250a == 1) {
/* 49 */                        f7587e.decrementAndGet(this);
                            }
/* 52 */                    return sm2Var;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final sm2 m3351g() {
                    e93 e93Var;
                    while (true) {
/* 3 */                 f7584b.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f7588f;
/* 15 */                sm2 sm2Var = (sm2) unsafe.getObjectVolatile(this, j);
/* 18 */                if (sm2Var == null || sm2Var.f16707b.f18250a != 1) {
                            break;
                        }
                        while (true) {
/* 28 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 33 */                    e93Var = this;
/* 38 */                    if (unsafe2.compareAndSwapObject(e93Var, f7588f, sm2Var, (Object) null)) {
/* 40 */                        return sm2Var;
                            }
/* 45 */                    if (unsafe2.getObjectVolatile(e93Var, j) != sm2Var) {
                                break;
                            }
/* 49 */                    this = e93Var;
                        }
/* 47 */                this = e93Var;
                    }
/* 20 */            e93 e93Var2 = this;
/* 53 */            int i = f7586d.get(e93Var2);
/* 59 */            int i2 = f7585c.get(e93Var2);
/* 63 */            while (i != i2 && f7587e.get(e93Var2) != 0) {
/* 74 */                i2--;
/* 76 */                sm2 sm2VarM3352h = e93Var2.m3352h(i2, true);
/* 80 */                if (sm2VarM3352h != null) {
/* 82 */                    return sm2VarM3352h;
                        }
                    }
/* 83 */            return null;
                }

                /* JADX INFO: renamed from: h */
                public final sm2 m3352h(int i, boolean z) {
/* 1 */             int i2 = i & 127;
/* 3 */             AtomicReferenceArray atomicReferenceArray = this.f7589a;
/* 9 */             sm2 sm2Var = (sm2) atomicReferenceArray.get(i2);
/* 12 */            if (sm2Var != null) {
/* 23 */                if ((sm2Var.f16707b.f18250a == 1) == z) {
/* 29 */                    while (!atomicReferenceArray.compareAndSet(i2, sm2Var, null)) {
/* 43 */                        if (atomicReferenceArray.get(i2) != sm2Var) {
                                }
                            }
/* 31 */                    if (z) {
/* 35 */                        f7587e.decrementAndGet(this);
                            }
/* 38 */                    return sm2Var;
                        }
                    }
/* 11 */            return null;
                }

                /* JADX INFO: renamed from: i */
                public final long m3353i(int i, h22 h22Var) {
                    e93 e93Var;
                    while (true) {
/* 3 */                 f7584b.getClass();
/* 6 */                 Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */                 long j = f7588f;
/* 15 */                sm2 sm2Var = (sm2) unsafe.getObjectVolatile(this, j);
/* 17 */                if (sm2Var == null) {
/* 33 */                    return -2L;
                        }
/* 31 */                if (((sm2Var.f16707b.f18250a != 1 ? 2 : 1) & i) == 0) {
/* 33 */                    return -2L;
                        }
/* 38 */                ym2.f19704f.getClass();
/* 47 */                long jNanoTime = System.nanoTime() - sm2Var.f16706a;
/* 48 */                long j2 = ym2.f19700b;
/* 52 */                if (jNanoTime < j2) {
/* 54 */                    return j2 - jNanoTime;
                        }
                        while (true) {
/* 56 */                    Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 61 */                    e93Var = this;
/* 66 */                    if (unsafe2.compareAndSwapObject(e93Var, f7588f, sm2Var, (Object) null)) {
/* 68 */                        h22Var.f8873a = sm2Var;
/* 70 */                        return -1L;
                            }
/* 77 */                    if (unsafe2.getObjectVolatile(e93Var, j) != sm2Var) {
                                break;
                            }
/* 81 */                    this = e93Var;
                        }
/* 79 */                this = e93Var;
                    }
                }
            }
