            package p000;

            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class p90 implements CoroutineContext {

                /* JADX INFO: renamed from: a */
                public final Throwable f15026a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ CoroutineContext f15027b;

                public p90(Throwable th, CoroutineContext coroutineContext) {
/* 4 */             this.f15026a = th;
/* 6 */             this.f15027b = coroutineContext;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 3 */             return this.f15027b.fold(obj, function2);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 3 */             return this.f15027b.get(interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 3 */             return this.f15027b.minusKey(interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 3 */             return this.f15027b.plus(coroutineContext);
                }
            }
