            package p000;

            import java.lang.reflect.UndeclaredThrowableException;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: renamed from: ls */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 82 */    public final class RunnableC1901ls extends yo0 implements Runnable {

                /* JADX INFO: renamed from: c */
                public InterfaceC2251ud f13466c;

                /* JADX INFO: renamed from: d */
                public final LinkedBlockingQueue f13467d = new LinkedBlockingQueue(1);

                /* JADX INFO: renamed from: e */
                public final CountDownLatch f13468e = new CountDownLatch(1);

                /* JADX INFO: renamed from: f */
                public s81 f13469f;

                /* JADX INFO: renamed from: i */
                public volatile s81 f13470i;

                public RunnableC1901ls(InterfaceC2251ud interfaceC2251ud, s81 s81Var) {
/* 19 */            this.f13466c = interfaceC2251ud;
/* 21 */            s81Var.getClass();
/* 24 */            this.f13469f = s81Var;
                }

                /* JADX INFO: renamed from: c */
                public static Object m6528c(LinkedBlockingQueue linkedBlockingQueue) {
                    Object objTake;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     objTake = linkedBlockingQueue.take();
                            break;
                        } catch (InterruptedException unused) {
/* 27 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 23 */                        Thread.currentThread().interrupt();
                            }
/* 26 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return objTake;
                }

                @Override // p000.yo0, java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 7 */             boolean z2 = false;
/* 8 */             if (!this.f19730a.cancel(z)) {
/* 7 */                 return false;
                    }
                    while (true) {
                        try {
/* 17 */                    this.f13467d.put(Boolean.valueOf(z));
                            break;
                        } catch (InterruptedException unused) {
/* 55 */                    z2 = true;
                        } catch (Throwable th) {
/* 45 */                    if (z2) {
/* 51 */                        Thread.currentThread().interrupt();
                            }
/* 54 */                    throw th;
                        }
                    }
/* 20 */            if (z2) {
/* 26 */                Thread.currentThread().interrupt();
                    }
/* 29 */            s81 s81Var = this.f13469f;
/* 31 */            if (s81Var != null) {
/* 33 */                s81Var.cancel(z);
                    }
/* 36 */            s81 s81Var2 = this.f13470i;
/* 38 */            if (s81Var2 != null) {
/* 40 */                s81Var2.cancel(z);
                    }
/* 16 */            return true;
                }

                @Override // p000.yo0, java.util.concurrent.Future
                public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 7 */             if (!this.f19730a.isDone()) {
/* 9 */                 TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
/* 11 */                if (timeUnit != timeUnit2) {
/* 13 */                    j = timeUnit2.convert(j, timeUnit);
/* 17 */                    timeUnit = timeUnit2;
                        }
/* 18 */                s81 s81Var = this.f13469f;
/* 22 */                if (s81Var != null) {
/* 24 */                    long jNanoTime = System.nanoTime();
/* 28 */                    s81Var.get(j, timeUnit);
/* 40 */                    j -= Math.max(0L, System.nanoTime() - jNanoTime);
                        }
/* 41 */                long jNanoTime2 = System.nanoTime();
/* 51 */                if (!this.f13468e.await(j, timeUnit)) {
/* 76 */                    throw new TimeoutException();
                        }
/* 62 */                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
/* 63 */                s81 s81Var2 = this.f13470i;
/* 65 */                if (s81Var2 != null) {
/* 67 */                    s81Var2.get(j, timeUnit);
                        }
                    }
/* 79 */            return this.f19730a.get(j, timeUnit);
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
                
                    return;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ls, yo0] */
                /* JADX WARN: Type inference failed for: r5v1, types: [ls] */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v3, types: [yo0] */
                /* JADX WARN: Type inference failed for: r5v4, types: [ls] */
                /* JADX WARN: Type inference failed for: r5v6, types: [yo0] */
                /* JADX WARN: Type inference failed for: r5v7, types: [yo0] */
                /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
                /* JADX WARN: Type inference failed for: r5v9 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    ?? r5;
/* 1 */             boolean z = false;
                    try {
                        try {
/* 11 */                    s81 s81VarMo10660apply = this.f13466c.mo10660apply(w11.m9448r(this.f13469f));
/* 15 */                    this.f13470i = s81VarMo10660apply;
/* 23 */                    if (this.f19730a.isCancelled()) {
/* 37 */                        s81VarMo10660apply.cancel(((Boolean) m6528c(this.f13467d)).booleanValue());
/* 40 */                        this.f13470i = null;
                            } else {
/* 70 */                        s81VarMo10660apply.mo3676a(new dp0(this, s81VarMo10660apply, 4, z), pg3.m7428g());
                            }
                        } catch (Exception e) {
/* 108 */                   C2260um c2260um = this.f19731b;
                            r5 = this;
/* 110 */                   if (c2260um != null) {
/* 112 */                       c2260um.m9041b(e);
                                r5 = this;
                            }
                        } catch (Error e2) {
/* 91 */                    C2260um c2260um2 = this.f19731b;
                            r5 = this;
/* 93 */                    if (c2260um2 != null) {
/* 95 */                        c2260um2.m9041b(e2);
                                r5 = this;
                            }
                        } catch (UndeclaredThrowableException e3) {
/* 116 */                   Throwable cause = e3.getCause();
/* 120 */                   C2260um c2260um3 = this.f19731b;
                            r5 = this;
/* 122 */                   if (c2260um3 != null) {
/* 124 */                       c2260um3.m9041b(cause);
                                r5 = this;
                            }
                        } finally {
/* 129 */                   this.f13466c = null;
/* 131 */                   this.f13469f = null;
/* 135 */                   this.f13468e.countDown();
                        }
                    } catch (CancellationException unused) {
/* 87 */                cancel(false);
                    } catch (ExecutionException e4) {
/* 75 */                Throwable cause2 = e4.getCause();
/* 79 */                C2260um c2260um4 = this.f19731b;
/* 81 */                if (c2260um4 != null) {
/* 83 */                    c2260um4.m9041b(cause2);
                        }
                    }
                }

                @Override // p000.yo0, java.util.concurrent.Future
/* 83 */        public final Object get() throws ExecutionException, InterruptedException {
/* 84 */            if (!this.f19730a.isDone()) {
/* 85 */                s81 s81Var = this.f13469f;
                        if (s81Var != null) {
/* 86 */                    s81Var.get();
                        }
/* 87 */                this.f13468e.await();
/* 88 */                s81 s81Var2 = this.f13470i;
                        if (s81Var2 != null) {
/* 89 */                    s81Var2.get();
                        }
                    }
/* 90 */            return this.f19730a.get();
                }
            }
