            package p000;

            import android.support.v4.media.session.PlaybackStateCompat;
            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class x10 implements Executor, Closeable {
                private volatile /* synthetic */ int _isTerminated$volatile;

                /* JADX INFO: renamed from: a */
                public final int f18893a;

                /* JADX INFO: renamed from: b */
                public final int f18894b;

                /* JADX INFO: renamed from: c */
                public final long f18895c;
                private volatile /* synthetic */ long controlState$volatile;

                /* JADX INFO: renamed from: d */
                public final String f18896d;

                /* JADX INFO: renamed from: e */
                public final ir0 f18897e;

                /* JADX INFO: renamed from: f */
                public final ir0 f18898f;

                /* JADX INFO: renamed from: i */
                public final p32 f18899i;
                private volatile /* synthetic */ long parkedWorkersStack$volatile;

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ AtomicLongFieldUpdater f18891v = AtomicLongFieldUpdater.newUpdater(x10.class, "parkedWorkersStack$volatile");

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ AtomicLongFieldUpdater f18892w = AtomicLongFieldUpdater.newUpdater(x10.class, "controlState$volatile");

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f18889U = AtomicIntegerFieldUpdater.newUpdater(x10.class, "_isTerminated$volatile");

                /* JADX INFO: renamed from: V */
                public static final C2131r4 f18890V = new C2131r4("NOT_IN_STACK", 8);

                public x10(String str, int i, int i2, long j) {
/* 4 */             this.f18893a = i;
/* 6 */             this.f18894b = i2;
/* 8 */             this.f18895c = j;
/* 10 */            this.f18896d = str;
/* 14 */            if (i < 1) {
/* 123 */               ds0.m3200q(AbstractC0886en.m3505i(i, "Core pool size ", " should be at least 1"));
/* 126 */               throw null;
                    }
/* 18 */            if (i2 < i) {
/* 111 */               ds0.m3200q(AbstractC0886en.m3506j("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
/* 114 */               throw null;
                    }
/* 23 */            if (i2 > 2097150) {
/* 101 */               ds0.m3200q(AbstractC0886en.m3505i(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
/* 104 */               throw null;
                    }
/* 29 */            if (j <= 0) {
/* 94 */                throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                    }
/* 36 */            this.f18897e = new ir0();
/* 43 */            this.f18898f = new ir0();
/* 54 */            this.f18899i = new p32((i + 1) * 2);
/* 60 */            this.controlState$volatile = ((long) i) << 42;
/* 63 */            this._isTerminated$volatile = 0;
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m9674g(x10 x10Var, Runnable runnable, int i) {
/* 10 */            x10Var.m9676f(runnable, ym2.f19705g, (i & 4) == 0);
                }

                /* JADX INFO: renamed from: c */
                public final int m9675c() {
                    synchronized (this.f18899i) {
                        try {
/* 17 */                    if (f18889U.get(this) != 0) {
/* 20 */                        return -1;
                            }
/* 22 */                    AtomicLongFieldUpdater atomicLongFieldUpdater = f18892w;
/* 24 */                    long j = atomicLongFieldUpdater.get(this);
/* 33 */                    int i = (int) (j & 2097151);
/* 44 */                    int i2 = i - ((int) ((j & 4398044413952L) >> 21));
/* 46 */                    if (i2 < 0) {
/* 48 */                        i2 = 0;
                            }
/* 51 */                    if (i2 >= this.f18893a) {
/* 11 */                        return 0;
                            }
/* 57 */                    if (i >= this.f18894b) {
/* 11 */                        return 0;
                            }
/* 67 */                    int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
/* 68 */                    if (i3 <= 0 || this.f18899i.m7322b(i3) != null) {
/* 119 */                       throw new IllegalArgumentException("Failed requirement.");
                            }
/* 80 */                    v10 v10Var = new v10(this, i3);
/* 85 */                    this.f18899i.m7323c(i3, v10Var);
/* 94 */                    if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
/* 109 */                       throw new IllegalArgumentException("Failed requirement.");
                            }
/* 96 */                    int i4 = i2 + 1;
/* 98 */                    v10Var.start();
/* 101 */                   return i4;
                        } catch (Throwable th) {
/* 121 */                   throw th;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:33:0x006e  */
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws InterruptedException {
                    int i;
                    sm2 sm2VarM9180a;
/* 9 */             if (f18889U.compareAndSet(this, 0, 1)) {
/* 12 */                Thread threadCurrentThread = Thread.currentThread();
/* 18 */                v10 v10Var = null;
/* 24 */                v10 v10Var2 = threadCurrentThread instanceof v10 ? (v10) threadCurrentThread : null;
/* 25 */                if (v10Var2 != null && v10Var2.f17833v == this) {
/* 32 */                    v10Var = v10Var2;
                        }
                        synchronized (this.f18899i) {
/* 46 */                    i = (int) (f18892w.get(this) & 2097151);
                        }
/* 48 */                if (1 <= i) {
/* 50 */                    int i2 = 1;
                            while (true) {
/* 53 */                        Object objM7322b = this.f18899i.m7322b(i2);
/* 57 */                        objM7322b.getClass();
/* 60 */                        v10 v10Var3 = (v10) objM7322b;
/* 62 */                        if (v10Var3 != v10Var) {
/* 70 */                            while (v10Var3.getState() != Thread.State.TERMINATED) {
/* 72 */                                LockSupport.unpark(v10Var3);
/* 77 */                                v10Var3.join(10000L);
                                    }
/* 85 */                            v10Var3.f17826a.m3348d(this.f18898f);
                                }
/* 88 */                        if (i2 == i) {
                                    break;
                                } else {
/* 90 */                            i2++;
                                }
                            }
                        }
/* 95 */                this.f18898f.m8741b();
/* 100 */               this.f18897e.m8741b();
                        while (true) {
/* 103 */                   if (v10Var != null) {
/* 105 */                       sm2VarM9180a = v10Var.m9180a(true);
/* 109 */                       if (sm2VarM9180a == null) {
/* 117 */                           sm2VarM9180a = (sm2) this.f18897e.m8743d();
/* 119 */                           if (sm2VarM9180a == null) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
/* 117 */                       sm2VarM9180a = (sm2) this.f18897e.m8743d();
/* 119 */                       if (sm2VarM9180a == null && (sm2VarM9180a = (sm2) this.f18898f.m8743d()) == null) {
                                    break;
                                }
                            }
                            try {
/* 151 */                       sm2VarM9180a.run();
                            } catch (Throwable th) {
/* 156 */                       Thread threadCurrentThread2 = Thread.currentThread();
/* 164 */                       threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                            }
                        }
/* 131 */               if (v10Var != null) {
/* 135 */                   v10Var.m9187h(w10.f18414e);
                        }
/* 142 */               f18891v.set(this, 0L);
/* 147 */               f18892w.set(this, 0L);
                    }
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 2 */             m9674g(this, runnable, 6);
                }

                /* JADX INFO: renamed from: f */
                public final void m9676f(Runnable runnable, vm2 vm2Var, boolean z) {
                    sm2 wm2Var;
                    w10 w10Var;
/* 3 */             ym2.f19704f.getClass();
/* 6 */             long jNanoTime = System.nanoTime();
/* 12 */            if (runnable instanceof sm2) {
/* 14 */                wm2Var = (sm2) runnable;
/* 16 */                wm2Var.f16706a = jNanoTime;
/* 18 */                wm2Var.f16707b = vm2Var;
                    } else {
/* 23 */                wm2Var = new wm2(runnable, jNanoTime, vm2Var);
                    }
/* 31 */            boolean z2 = false;
/* 37 */            boolean z3 = wm2Var.f16707b.f18250a == 1;
/* 38 */            AtomicLongFieldUpdater atomicLongFieldUpdater = f18892w;
/* 50 */            long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
/* 52 */            Thread threadCurrentThread = Thread.currentThread();
/* 58 */            v10 v10Var = null;
/* 64 */            v10 v10Var2 = threadCurrentThread instanceof v10 ? (v10) threadCurrentThread : null;
/* 65 */            if (v10Var2 != null && v10Var2.f17833v == this) {
/* 72 */                v10Var = v10Var2;
                    }
/* 73 */            if (v10Var != null && (w10Var = v10Var.f17828c) != w10.f18414e && (wm2Var.f16707b.f18250a != 0 || w10Var != w10.f18411b)) {
/* 94 */                v10Var.f17832i = true;
/* 98 */                wm2Var = v10Var.f17826a.m3345a(wm2Var, z);
                    }
/* 102 */           if (wm2Var != null) {
/* 123 */               if (!(wm2Var.f16707b.f18250a == 1 ? this.f18898f.m8740a(wm2Var) : this.f18897e.m8740a(wm2Var))) {
/* 144 */                   throw new RejectedExecutionException(fm0.m3789o(new StringBuilder(), this.f18896d, " was terminated"));
                        }
                    }
/* 145 */           if (z && v10Var != null) {
/* 149 */               z2 = true;
                    }
/* 150 */           if (z3) {
/* 152 */               if (z2 || m9679k() || m9678i(jAddAndGet)) {
/* 193 */                   return;
                        }
/* 169 */               m9679k();
/* 172 */               return;
                    }
/* 173 */           if (z2 || m9679k() || m9678i(atomicLongFieldUpdater.get(this))) {
/* 193 */               return;
                    }
/* 194 */           m9679k();
                }

                /* JADX INFO: renamed from: h */
                public final void m9677h(v10 v10Var, int i, int i2) {
                    while (true) {
/* 3 */                 long j = f18891v.get(this);
/* 11 */                int i3 = (int) (2097151 & j);
/* 19 */                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
/* 20 */                if (i3 == i) {
/* 22 */                    if (i2 == 0) {
/* 24 */                        Object objM9182c = v10Var.m9182c();
                                while (true) {
/* 30 */                            if (objM9182c == f18890V) {
/* 32 */                                i3 = -1;
                                        break;
                                    }
/* 34 */                            if (objM9182c == null) {
/* 36 */                                i3 = 0;
                                        break;
                                    }
/* 38 */                            v10 v10Var2 = (v10) objM9182c;
/* 40 */                            int iM9181b = v10Var2.m9181b();
/* 44 */                            if (iM9181b != 0) {
/* 46 */                                i3 = iM9181b;
                                        break;
                                    }
/* 48 */                            objM9182c = v10Var2.m9182c();
                                }
                            } else {
/* 53 */                        i3 = i2;
                            }
                        }
/* 54 */                if (i3 >= 0) {
/* 60 */                    x10 x10Var = this;
/* 65 */                    if (f18891v.compareAndSet(x10Var, j, ((long) i3) | j2)) {
/* 67 */                        return;
                            } else {
/* 68 */                        this = x10Var;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final boolean m9678i(long j) {
/* 16 */            int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
/* 18 */            if (i < 0) {
/* 20 */                i = 0;
                    }
/* 21 */            int i2 = this.f18893a;
/* 23 */            if (i < i2) {
/* 25 */                int iM9675c = m9675c();
/* 30 */                if (iM9675c == 1 && i2 > 1) {
/* 34 */                    m9675c();
                        }
/* 37 */                if (iM9675c > 0) {
/* 29 */                    return true;
                        }
                    }
/* 17 */            return false;
                }

                /* JADX INFO: renamed from: k */
                public final boolean m9679k() {
                    x10 x10Var;
                    C2131r4 c2131r4;
                    int iM9181b;
                    while (true) {
/* 3 */                 long j = f18891v.get(this);
/* 18 */                v10 v10Var = (v10) this.f18899i.m7322b((int) (2097151 & j));
/* 22 */                if (v10Var == null) {
/* 24 */                    v10Var = null;
/* 25 */                    x10Var = this;
                        } else {
/* 34 */                    long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
/* 35 */                    Object objM9182c = v10Var.m9182c();
                            while (true) {
/* 39 */                        c2131r4 = f18890V;
/* 41 */                        if (objM9182c == c2131r4) {
/* 43 */                            iM9181b = -1;
                                    break;
                                }
/* 45 */                        if (objM9182c == null) {
/* 47 */                            iM9181b = 0;
                                    break;
                                }
/* 49 */                        v10 v10Var2 = (v10) objM9182c;
/* 51 */                        iM9181b = v10Var2.m9181b();
/* 55 */                        if (iM9181b != 0) {
                                    break;
                                }
/* 94 */                        objM9182c = v10Var2.m9182c();
/* 98 */                        j = j;
                            }
/* 57 */                    if (iM9181b >= 0) {
/* 63 */                        x10 x10Var2 = this;
/* 64 */                        boolean zCompareAndSet = f18891v.compareAndSet(x10Var2, j, ((long) iM9181b) | j2);
/* 68 */                        x10Var = x10Var2;
/* 69 */                        if (zCompareAndSet) {
/* 71 */                            v10Var.m9186g(c2131r4);
                                }
/* 90 */                        this = x10Var;
                            } else {
                                continue;
                            }
                        }
/* 74 */                if (v10Var == null) {
/* 21 */                    return false;
                        }
/* 83 */                if (v10.f17825w.compareAndSet(v10Var, -1, 0)) {
/* 85 */                    LockSupport.unpark(v10Var);
/* 88 */                    return true;
                        }
/* 90 */                this = x10Var;
                    }
                }

                public final String toString() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             p32 p32Var = this.f18899i;
/* 8 */             int iM7321a = p32Var.m7321a();
/* 12 */            int i = 0;
/* 14 */            int i2 = 0;
/* 15 */            int i3 = 0;
/* 16 */            int i4 = 0;
/* 17 */            int i5 = 0;
/* 19 */            for (int i6 = 1; i6 < iM7321a; i6++) {
/* 25 */                v10 v10Var = (v10) p32Var.m7322b(i6);
/* 27 */                if (v10Var != null) {
/* 32 */                    int iM3347c = v10Var.f17826a.m3347c();
/* 38 */                    int iOrdinal = v10Var.f17828c.ordinal();
/* 42 */                    if (iOrdinal == 0) {
/* 110 */                       i++;
/* 114 */                       StringBuilder sb = new StringBuilder();
/* 117 */                       sb.append(iM3347c);
/* 122 */                       sb.append('c');
/* 129 */                       arrayList.add(sb.toString());
                            } else if (iOrdinal == 1) {
/* 87 */                        i2++;
/* 91 */                        StringBuilder sb2 = new StringBuilder();
/* 94 */                        sb2.append(iM3347c);
/* 99 */                        sb2.append('b');
/* 106 */                       arrayList.add(sb2.toString());
                            } else if (iOrdinal == 2) {
/* 84 */                        i3++;
                            } else if (iOrdinal == 3) {
/* 59 */                        i4++;
/* 61 */                        if (iM3347c > 0) {
/* 65 */                            StringBuilder sb3 = new StringBuilder();
/* 68 */                            sb3.append(iM3347c);
/* 73 */                            sb3.append('d');
/* 80 */                            arrayList.add(sb3.toString());
                                }
                            } else if (iOrdinal == 4) {
/* 56 */                        i5++;
                            }
                        }
                    }
/* 137 */           long j = f18892w.get(this);
/* 143 */           StringBuilder sb4 = new StringBuilder();
/* 148 */           sb4.append(this.f18896d);
/* 153 */           sb4.append('@');
/* 160 */           sb4.append(k50.m5983t(this));
/* 165 */           sb4.append("[Pool Size {core = ");
/* 168 */           int i7 = this.f18893a;
/* 170 */           sb4.append(i7);
/* 175 */           sb4.append(", max = ");
/* 180 */           sb4.append(this.f18894b);
/* 185 */           sb4.append("}, Worker States {CPU = ");
/* 188 */           sb4.append(i);
/* 193 */           sb4.append(", blocking = ");
/* 196 */           sb4.append(i2);
/* 201 */           sb4.append(", parked = ");
/* 204 */           sb4.append(i3);
/* 209 */           sb4.append(", dormant = ");
/* 212 */           sb4.append(i4);
/* 217 */           sb4.append(", terminated = ");
/* 220 */           sb4.append(i5);
/* 225 */           sb4.append("}, running workers queues = ");
/* 228 */           sb4.append(arrayList);
/* 233 */           sb4.append(", global CPU queue size = ");
/* 242 */           sb4.append(this.f18897e.m8742c());
/* 247 */           sb4.append(", global blocking queue size = ");
/* 256 */           sb4.append(this.f18898f.m8742c());
/* 261 */           sb4.append(", Control State {created workers= ");
/* 269 */           sb4.append((int) (2097151 & j));
/* 274 */           sb4.append(", blocking tasks = ");
/* 287 */           sb4.append((int) ((4398044413952L & j) >> 21));
/* 292 */           sb4.append(", CPUs acquired = ");
/* 307 */           sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
/* 312 */           sb4.append("}]");
/* 315 */           return sb4.toString();
                }
            }
