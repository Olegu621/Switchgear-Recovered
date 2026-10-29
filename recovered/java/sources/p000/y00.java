            package p000;

            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y00 implements y10 {

                /* JADX INFO: renamed from: a */
                public final CoroutineContext f19427a;

                public y00(CoroutineContext coroutineContext) {
/* 4 */             this.f19427a = coroutineContext;
                }

                @Override // p000.y10
                /* JADX INFO: renamed from: c */
                public final CoroutineContext mo4406c() {
/* 1 */             return this.f19427a;
                }

                public final String toString() {
/* 18 */            return "CoroutineScope(coroutineContext=" + this.f19427a + ')';
                }
            }
