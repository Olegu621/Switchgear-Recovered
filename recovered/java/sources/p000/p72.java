            package p000;

            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class p72 extends AbstractC1010i implements a20 {

                /* JADX INFO: renamed from: f */
                public final c10 f15010f;

                public p72(c10 c10Var, CoroutineContext coroutineContext) {
/* 2 */             super(coroutineContext, true);
/* 5 */             this.f15010f = c10Var;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: C */
                public final boolean mo7345C() {
/* 1 */             return true;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: g */
                public void mo7346g(Object obj) {
/* 1 */             xe2.m9759C(mz0.m6834b(this.f15010f), de3.m3016D(obj));
                }

                @Override // p000.a20
                public final a20 getCallerFrame() {
/* 1 */             c10 c10Var = this.f15010f;
/* 5 */             if (c10Var instanceof a20) {
/* 7 */                 return (a20) c10Var;
                    }
/* 10 */            return null;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: h */
                public void mo6307h(Object obj) {
/* 7 */             this.f15010f.resumeWith(de3.m3016D(obj));
                }
            }
