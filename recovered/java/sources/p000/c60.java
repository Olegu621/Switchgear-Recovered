            package p000;

            import java.util.concurrent.Executor;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class c60 extends nf0 implements Executor {

                /* JADX INFO: renamed from: c */
                public static final c60 f2732c = new c60();

                /* JADX INFO: renamed from: d */
                public static final s10 f2733d;

                static {
/* 8 */             vx2 vx2Var = vx2.f18386c;
/* 10 */            int i = ik2.f9695a;
/* 14 */            if (64 >= i) {
/* 17 */                i = 64;
                    }
/* 30 */            f2733d = vx2Var.mo1541k(j13.m5663y(i, 12, "kotlinx.coroutines.io.parallelism"));
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 8 */             throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 3 */             mo1539g(C1846g.f12919a, runnable);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
/* 3 */             f2733d.mo1539g(coroutineContext, runnable);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: h */
                public final void mo1540h(CoroutineContext coroutineContext, Runnable runnable) {
/* 3 */             f2733d.mo1540h(coroutineContext, runnable);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: k */
                public final s10 mo1541k(int i) {
/* 4 */             return vx2.f18386c.mo1541k(1);
                }

                @Override // p000.s10
                public final String toString() {
/* 1 */             return "Dispatchers.IO";
                }
            }
