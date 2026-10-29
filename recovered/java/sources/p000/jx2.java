            package p000;

            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class jx2 extends s10 {

                /* JADX INFO: renamed from: c */
                public static final jx2 f12535c = new jx2();

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
/* 7 */             r93 r93Var = (r93) coroutineContext.get(r93.f15934c);
/* 9 */             if (r93Var != null) {
/* 12 */                r93Var.f15935b = true;
                    } else {
/* 17 */                C1951n4.m6866q("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
                    }
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: k */
                public final s10 mo1541k(int i) {
/* 8 */             throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
                }

                @Override // p000.s10
                public final String toString() {
/* 1 */             return "Dispatchers.Unconfined";
                }
            }
