            package p000;

            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class dg2 implements c10, a20 {

                /* JADX INFO: renamed from: a */
                public final c10 f7176a;

                /* JADX INFO: renamed from: b */
                public final CoroutineContext f7177b;

                public dg2(c10 c10Var, CoroutineContext coroutineContext) {
/* 4 */             this.f7176a = c10Var;
/* 6 */             this.f7177b = coroutineContext;
                }

                @Override // p000.a20
                public final a20 getCallerFrame() {
/* 1 */             c10 c10Var = this.f7176a;
/* 5 */             if (c10Var instanceof a20) {
/* 7 */                 return (a20) c10Var;
                    }
/* 10 */            return null;
                }

                @Override // p000.c10
                public final CoroutineContext getContext() {
/* 1 */             return this.f7177b;
                }

                @Override // p000.c10
                public final void resumeWith(Object obj) {
/* 3 */             this.f7176a.resumeWith(obj);
                }
            }
