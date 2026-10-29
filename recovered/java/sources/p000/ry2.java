            package p000;

            import kotlin.coroutines.AbstractC1844e;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ry2 implements CoroutineContext.Element {

                /* JADX INFO: renamed from: a */
                public final ry2 f16349a;

                /* JADX INFO: renamed from: b */
                public final b50 f16350b;

                public ry2(ry2 ry2Var, b50 b50Var) {
/* 4 */             this.f16349a = ry2Var;
/* 6 */             this.f16350b = b50Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m8335a(b50 b50Var) {
/* 3 */             if (this.f16350b == b50Var) {
/* 15 */                f42.m3656l("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
/* 18 */                return;
                    }
/* 5 */             ry2 ry2Var = this.f16349a;
/* 7 */             if (ry2Var != null) {
/* 9 */                 ry2Var.m8335a(b50Var);
                    }
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 1 */             return function2.invoke(obj, this);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 1 */             return AbstractC1844e.m6213a(this, interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element
                public final InterfaceC1845f getKey() {
/* 1 */             return xt0.f19357V;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 1 */             return AbstractC1844e.m6214b(this, interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 1 */             return AbstractC1844e.m6215c(this, coroutineContext);
                }
            }
