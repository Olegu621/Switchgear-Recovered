            package p000;

            import kotlin.coroutines.AbstractC1844e;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class lx2 implements CoroutineContext.Element, InterfaceC1845f {

                /* JADX INFO: renamed from: a */
                public static final lx2 f13526a = new lx2();

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
/* 1 */             return this;
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
