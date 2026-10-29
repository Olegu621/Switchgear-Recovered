            package p000;

            import android.support.v4.media.session.PlaybackStateCompat;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class v10 extends Thread {

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f17825w = AtomicIntegerFieldUpdater.newUpdater(v10.class, "workerCtl$volatile");

                /* JADX INFO: renamed from: a */
                public final e93 f17826a;

                /* JADX INFO: renamed from: b */
                public final h22 f17827b;

                /* JADX INFO: renamed from: c */
                public w10 f17828c;

                /* JADX INFO: renamed from: d */
                public long f17829d;

                /* JADX INFO: renamed from: e */
                public long f17830e;

                /* JADX INFO: renamed from: f */
                public int f17831f;

                /* JADX INFO: renamed from: i */
                public boolean f17832i;
                private volatile int indexInArray;
                private volatile Object nextParkedWorker;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ x10 f17833v;
                private volatile /* synthetic */ int workerCtl$volatile;

                public v10(x10 x10Var, int i) {
/* 1 */             this.f17833v = x10Var;
/* 7 */             setDaemon(true);
/* 16 */            setContextClassLoader(x10.class.getClassLoader());
/* 24 */            this.f17826a = new e93();
/* 31 */            this.f17827b = new h22();
/* 35 */            this.f17828c = w10.f18413d;
/* 39 */            this.nextParkedWorker = x10.f18890V;
/* 45 */            int iNanoTime = (int) System.nanoTime();
/* 51 */            this.f17831f = iNanoTime == 0 ? 42 : iNanoTime;
/* 53 */            m9185f(i);
                }

                /* JADX INFO: renamed from: a */
                public final sm2 m9180a(boolean z) {
                    sm2 sm2VarM9184e;
                    sm2 sm2VarM9184e2;
                    long j;
/* 1 */             w10 w10Var = this.f17828c;
/* 3 */             w10 w10Var2 = w10.f18410a;
/* 5 */             x10 x10Var = this.f17833v;
/* 8 */             e93 e93Var = this.f17826a;
/* 10 */            if (w10Var != w10Var2) {
/* 13 */                AtomicLongFieldUpdater atomicLongFieldUpdater = x10.f18892w;
/* 66 */                do {
/* 15 */                    j = atomicLongFieldUpdater.get(x10Var);
/* 29 */                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
/* 31 */                        sm2 sm2VarM3351g = e93Var.m3351g();
                                return (sm2VarM3351g == null && (sm2VarM3351g = (sm2) x10Var.f18898f.m8743d()) == null) ? m9188i(1) : sm2VarM3351g;
                            }
/* 66 */                } while (!x10.f18892w.compareAndSet(x10Var, j, j - 4398046511104L));
/* 70 */                this.f17828c = w10.f18410a;
                    }
/* 72 */            if (z) {
/* 82 */                boolean z2 = m9183d(x10Var.f18893a * 2) == 0;
/* 86 */                if (z2 && (sm2VarM9184e2 = m9184e()) != null) {
/* 94 */                    return sm2VarM9184e2;
                        }
/* 95 */                sm2 sm2VarM3349e = e93Var.m3349e();
/* 99 */                if (sm2VarM3349e != null) {
/* 101 */                   return sm2VarM3349e;
                        }
/* 102 */               if (!z2 && (sm2VarM9184e = m9184e()) != null) {
/* 110 */                   return sm2VarM9184e;
                        }
                    } else {
/* 111 */               sm2 sm2VarM9184e3 = m9184e();
/* 115 */               if (sm2VarM9184e3 != null) {
/* 117 */                   return sm2VarM9184e3;
                        }
                    }
/* 119 */           return m9188i(3);
                }

                /* JADX INFO: renamed from: b */
                public final int m9181b() {
/* 1 */             return this.indexInArray;
                }

                /* JADX INFO: renamed from: c */
                public final Object m9182c() {
/* 1 */             return this.nextParkedWorker;
                }

                /* JADX INFO: renamed from: d */
                public final int m9183d(int i) {
/* 1 */             int i2 = this.f17831f;
/* 5 */             int i3 = i2 ^ (i2 << 13);
/* 8 */             int i4 = i3 ^ (i3 >> 17);
/* 11 */            int i5 = i4 ^ (i4 << 5);
/* 12 */            this.f17831f = i5;
/* 14 */            int i6 = i - 1;
                    return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
                }

                /* JADX INFO: renamed from: e */
                public final sm2 m9184e() {
/* 2 */             int iM9183d = m9183d(2);
/* 6 */             x10 x10Var = this.f17833v;
/* 8 */             ir0 ir0Var = x10Var.f18898f;
/* 10 */            ir0 ir0Var2 = x10Var.f18897e;
/* 12 */            if (iM9183d == 0) {
/* 18 */                sm2 sm2Var = (sm2) ir0Var2.m8743d();
                        return sm2Var != null ? sm2Var : (sm2) ir0Var.m8743d();
                    }
/* 34 */            sm2 sm2Var2 = (sm2) ir0Var.m8743d();
                    return sm2Var2 != null ? sm2Var2 : (sm2) ir0Var2.m8743d();
                }

                /* JADX INFO: renamed from: f */
                public final void m9185f(int i) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(this.f17833v.f18896d);
/* 15 */            sb.append("-worker-");
/* 27 */            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
/* 34 */            setName(sb.toString());
/* 37 */            this.indexInArray = i;
                }

                /* JADX INFO: renamed from: g */
                public final void m9186g(Object obj) {
/* 1 */             this.nextParkedWorker = obj;
                }

                /* JADX INFO: renamed from: h */
                public final boolean m9187h(w10 w10Var) {
/* 1 */             w10 w10Var2 = this.f17828c;
/* 9 */             boolean z = w10Var2 == w10.f18410a;
/* 10 */            if (z) {
/* 21 */                x10.f18892w.addAndGet(this.f17833v, 4398046511104L);
                    }
/* 24 */            if (w10Var2 != w10Var) {
/* 26 */                this.f17828c = w10Var;
                    }
/* 28 */            return z;
                }

                /* JADX INFO: renamed from: i */
                public final sm2 m9188i(int i) {
                    sm2 sm2VarM3352h;
                    long jM3353i;
/* 5 */             AtomicLongFieldUpdater atomicLongFieldUpdater = x10.f18892w;
/* 7 */             x10 x10Var = this.f17833v;
/* 17 */            int i2 = (int) (atomicLongFieldUpdater.get(x10Var) & 2097151);
/* 20 */            if (i2 < 2) {
/* 19 */                return null;
                    }
/* 23 */            int iM9183d = m9183d(i2);
/* 28 */            long jMin = Long.MAX_VALUE;
/* 35 */            for (int i3 = 0; i3 < i2; i3++) {
/* 38 */                iM9183d++;
/* 39 */                if (iM9183d > i2) {
/* 41 */                    iM9183d = 1;
                        }
/* 48 */                v10 v10Var = (v10) x10Var.f18899i.m7322b(iM9183d);
/* 50 */                if (v10Var != null && v10Var != this) {
/* 54 */                    e93 e93Var = v10Var.f17826a;
/* 57 */                    if (i != 3) {
/* 69 */                        e93Var.getClass();
/* 74 */                        int i4 = e93.f7586d.get(e93Var);
/* 85 */                        int i5 = e93.f7585c.get(e93Var);
/* 89 */                        boolean z = i == 1;
                                while (true) {
/* 93 */                            if (i4 == i5 || (z && e93.f7587e.get(e93Var) == 0)) {
/* 105 */                               sm2VarM3352h = null;
                                        break;
                                    }
/* 107 */                           int i6 = i4 + 1;
/* 109 */                           sm2VarM3352h = e93Var.m3352h(i4, z);
/* 113 */                           if (sm2VarM3352h != null) {
                                        break;
                                    }
/* 115 */                           i4 = i6;
                                }
                            } else {
/* 59 */                        sm2VarM3352h = e93Var.m3350f();
                            }
/* 117 */                   h22 h22Var = this.f17827b;
/* 119 */                   if (sm2VarM3352h != null) {
/* 121 */                       h22Var.f8873a = sm2VarM3352h;
/* 123 */                       jM3353i = -1;
                            } else {
/* 128 */                       jM3353i = e93Var.m3353i(i, h22Var);
                            }
/* 137 */                   if (jM3353i == -1) {
/* 141 */                       sm2 sm2Var = (sm2) h22Var.f8873a;
/* 143 */                       h22Var.f8873a = null;
/* 145 */                       return sm2Var;
                            }
/* 148 */                   if (jM3353i > 0) {
/* 150 */                       jMin = Math.min(jMin, jM3353i);
                            }
                        }
                    }
/* 171 */           if (jMin == Long.MAX_VALUE) {
/* 174 */               jMin = 0;
                    }
/* 175 */           this.f17830e = jMin;
/* 19 */            return null;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    long j;
                    loop0: while (true) {
/* 4 */                 boolean z = false;
                        while (true) {
/* 13 */                    if (x10.f18889U.get(this.f17833v) == 0) {
/* 17 */                        w10 w10Var = this.f17828c;
/* 19 */                        w10 w10Var2 = w10.f18414e;
/* 21 */                        if (w10Var == w10Var2) {
                                    break loop0;
                                }
/* 25 */                        sm2 sm2VarM9180a = m9180a(this.f17832i);
/* 34 */                        if (sm2VarM9180a != null) {
/* 36 */                            this.f17830e = 0L;
/* 38 */                            x10 x10Var = this.f17833v;
/* 42 */                            int i = sm2VarM9180a.f16707b.f18250a;
/* 44 */                            this.f17829d = 0L;
/* 50 */                            if (this.f17828c == w10.f18412c) {
/* 54 */                                this.f17828c = w10.f18411b;
                                    }
/* 56 */                            if (i != 0 && m9187h(w10.f18411b) && !x10Var.m9679k() && !x10Var.m9678i(x10.f18892w.get(x10Var))) {
/* 87 */                                x10Var.m9679k();
                                    }
                                    try {
/* 90 */                                sm2VarM9180a.run();
                                    } catch (Throwable th) {
/* 95 */                                Thread threadCurrentThread = Thread.currentThread();
/* 103 */                               threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                    }
/* 106 */                           if (i != 0) {
/* 111 */                               x10.f18892w.addAndGet(x10Var, -2097152L);
/* 116 */                               if (this.f17828c == w10Var2) {
                                            break;
                                        }
/* 120 */                               this.f17828c = w10.f18413d;
                                        break;
                                    }
                                    break;
                                }
/* 123 */                       this.f17832i = false;
/* 130 */                       if (this.f17830e == 0) {
/* 154 */                           Object obj = this.nextParkedWorker;
/* 156 */                           C2131r4 c2131r4 = x10.f18890V;
/* 158 */                           if (obj != c2131r4) {
/* 163 */                               f17825w.set(this, -1);
/* 170 */                               while (this.nextParkedWorker != x10.f18890V) {
/* 172 */                                   AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17825w;
/* 178 */                                   if (atomicIntegerFieldUpdater.get(this) != -1) {
                                                break;
                                            }
/* 180 */                                   x10 x10Var2 = this.f17833v;
/* 182 */                                   AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = x10.f18889U;
/* 188 */                                   if (atomicIntegerFieldUpdater2.get(x10Var2) != 0) {
                                                break;
                                            }
/* 192 */                                   w10 w10Var3 = this.f17828c;
/* 194 */                                   w10 w10Var4 = w10.f18414e;
/* 196 */                                   if (w10Var3 == w10Var4) {
                                                break;
                                            }
/* 202 */                                   m9187h(w10.f18412c);
/* 205 */                                   Thread.interrupted();
/* 212 */                                   if (this.f17829d == 0) {
/* 220 */                                       j = 2097151;
/* 226 */                                       this.f17829d = System.nanoTime() + this.f17833v.f18895c;
                                            } else {
/* 229 */                                       j = 2097151;
                                            }
/* 236 */                                   LockSupport.parkNanos(this.f17833v.f18895c);
/* 248 */                                   if (System.nanoTime() - this.f17829d >= 0) {
/* 250 */                                       this.f17829d = 0L;
/* 252 */                                       x10 x10Var3 = this.f17833v;
                                                synchronized (x10Var3.f18899i) {
                                                    try {
/* 266 */                                               if (!(atomicIntegerFieldUpdater2.get(x10Var3) != 0)) {
/* 270 */                                                   AtomicLongFieldUpdater atomicLongFieldUpdater = x10.f18892w;
/* 280 */                                                   if (((int) (atomicLongFieldUpdater.get(x10Var3) & j)) > x10Var3.f18893a) {
/* 288 */                                                       if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
/* 292 */                                                           int i2 = this.indexInArray;
/* 294 */                                                           m9185f(0);
/* 297 */                                                           x10Var3.m9677h(this, i2, 0);
/* 305 */                                                           int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(x10Var3) & j);
/* 306 */                                                           if (andDecrement != i2) {
/* 310 */                                                               Object objM7322b = x10Var3.f18899i.m7322b(andDecrement);
/* 314 */                                                               objM7322b.getClass();
/* 317 */                                                               v10 v10Var = (v10) objM7322b;
/* 321 */                                                               x10Var3.f18899i.m7323c(i2, v10Var);
/* 324 */                                                               v10Var.m9185f(i2);
/* 327 */                                                               x10Var3.m9677h(v10Var, andDecrement, i2);
                                                                    }
/* 336 */                                                           x10Var3.f18899i.m7323c(andDecrement, null);
/* 340 */                                                           this.f17828c = w10Var4;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
/* 345 */                                               throw th2;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
/* 349 */                               x10 x10Var4 = this.f17833v;
/* 353 */                               if (this.nextParkedWorker == c2131r4) {
/* 357 */                                   AtomicLongFieldUpdater atomicLongFieldUpdater2 = x10.f18891v;
                                            while (true) {
/* 359 */                                       long j2 = atomicLongFieldUpdater2.get(x10Var4);
/* 371 */                                       long j3 = (j2 + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152);
/* 372 */                                       int i3 = this.indexInArray;
/* 380 */                                       this.nextParkedWorker = x10Var4.f18899i.m7322b((int) (j2 & 2097151));
/* 387 */                                       x10 x10Var5 = x10Var4;
/* 393 */                                       if (x10.f18891v.compareAndSet(x10Var5, j2, j3 | ((long) i3))) {
                                                    break;
                                                } else {
/* 397 */                                           x10Var4 = x10Var5;
                                                }
                                            }
                                        }
                                    }
                                } else {
/* 132 */                           if (z) {
/* 139 */                               m9187h(w10.f18412c);
/* 142 */                               Thread.interrupted();
/* 147 */                               LockSupport.parkNanos(this.f17830e);
/* 150 */                               this.f17830e = 0L;
                                        break;
                                    }
/* 134 */                           z = true;
                                }
                            } else {
                                break loop0;
                            }
                        }
                    }
/* 402 */           m9187h(w10.f18414e);
                }
            }
