            package p000;

            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class m60 extends nf0 {

                /* JADX INFO: renamed from: d */
                public static final m60 f13573d;

                /* JADX INFO: renamed from: c */
                public x10 f13574c;

                static {
/* 3 */             int i = ym2.f19701c;
/* 5 */             int i2 = ym2.f19702d;
/* 7 */             long j = ym2.f19703e;
/* 9 */             String str = ym2.f19699a;
/* 11 */            m60 m60Var = new m60();
/* 19 */            m60Var.f13574c = new x10(str, i, i2, j);
/* 21 */            f13573d = m60Var;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 8 */             throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
/* 4 */             x10.m9674g(this.f13574c, runnable, 6);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: h */
                public final void mo1540h(CoroutineContext coroutineContext, Runnable runnable) {
/* 4 */             x10.m9674g(this.f13574c, runnable, 2);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: k */
                public final s10 mo1541k(int i) {
/* 2 */             j13.m5643c(1);
                    return 1 >= ym2.f19701c ? this : super.mo1541k(1);
                }

                @Override // p000.s10
                public final String toString() {
/* 1 */             return "Dispatchers.Default";
                }
            }
