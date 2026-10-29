            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class m71 extends s10 implements g70 {

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f13641v = AtomicIntegerFieldUpdater.newUpdater(m71.class, "runningWorkers$volatile");

                /* JADX INFO: renamed from: c */
                public final s10 f13642c;

                /* JADX INFO: renamed from: d */
                public final int f13643d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ g70 f13644e;

                /* JADX INFO: renamed from: f */
                public final t91 f13645f;

                /* JADX INFO: renamed from: i */
                public final Object f13646i;
                private volatile /* synthetic */ int runningWorkers$volatile;

                /* JADX WARN: Multi-variable type inference failed */
                public m71(s10 s10Var, int i) {
/* 4 */             this.f13642c = s10Var;
/* 6 */             this.f13643d = i;
/* 15 */            g70 g70Var = s10Var instanceof g70 ? (g70) s10Var : null;
/* 20 */            this.f13644e = g70Var == null ? x50.f18955a : g70Var;
/* 27 */            this.f13645f = new t91();
/* 34 */            this.f13646i = new Object();
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: c */
                public final e90 mo3417c(long j, mo2 mo2Var, CoroutineContext coroutineContext) {
/* 3 */             return this.f13644e.mo3417c(j, mo2Var, coroutineContext);
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: f */
                public final void mo3418f(long j, C0890er c0890er) {
/* 3 */             this.f13644e.mo3418f(j, c0890er);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
                    Runnable runnableM6615l;
/* 3 */             this.f13645f.m8740a(runnable);
/* 14 */            if (f13641v.get(this) >= this.f13643d || !m6616m() || (runnableM6615l = m6615l()) == null) {
/* 42 */                return;
                    }
/* 39 */            this.f13642c.mo1539g(this, new cp0(this, runnableM6615l, 16, false));
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: h */
                public final void mo1540h(CoroutineContext coroutineContext, Runnable runnable) {
                    Runnable runnableM6615l;
/* 3 */             this.f13645f.m8740a(runnable);
/* 14 */            if (f13641v.get(this) >= this.f13643d || !m6616m() || (runnableM6615l = m6615l()) == null) {
/* 42 */                return;
                    }
/* 39 */            this.f13642c.mo1540h(this, new cp0(this, runnableM6615l, 16, false));
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: k */
                public final s10 mo1541k(int i) {
/* 2 */             j13.m5643c(1);
                    return 1 >= this.f13643d ? this : super.mo1541k(1);
                }

                /* JADX INFO: renamed from: l */
                public final Runnable m6615l() {
                    while (true) {
/* 7 */                 Runnable runnable = (Runnable) this.f13645f.m8743d();
/* 9 */                 if (runnable != null) {
/* 38 */                    return runnable;
                        }
                        synchronized (this.f13646i) {
/* 14 */                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13641v;
/* 16 */                    atomicIntegerFieldUpdater.decrementAndGet(this);
/* 25 */                    if (this.f13645f.m8742c() == 0) {
/* 28 */                        return null;
                            }
/* 30 */                    atomicIntegerFieldUpdater.incrementAndGet(this);
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final boolean m6616m() {
                    synchronized (this.f13646i) {
/* 4 */                 AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13641v;
/* 12 */                if (atomicIntegerFieldUpdater.get(this) >= this.f13643d) {
/* 15 */                    return false;
                        }
/* 17 */                atomicIntegerFieldUpdater.incrementAndGet(this);
/* 21 */                return true;
                    }
                }
            }
