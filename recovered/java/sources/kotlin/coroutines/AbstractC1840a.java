            package kotlin.coroutines;

            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: renamed from: kotlin.coroutines.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1840a implements CoroutineContext.Element {

                /* JADX INFO: renamed from: a */
                public final InterfaceC1845f f12913a;

                public AbstractC1840a(InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
/* 7 */             this.f12913a = interfaceC1845f;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 1 */             return function2.invoke(obj, this);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 1 */             return AbstractC1844e.m6213a(this, interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element
                public final InterfaceC1845f getKey() {
/* 1 */             return this.f12913a;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 1 */             return AbstractC1844e.m6214b(this, interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 1 */             return AbstractC1844e.m6215c(this, coroutineContext);
                }
            }
