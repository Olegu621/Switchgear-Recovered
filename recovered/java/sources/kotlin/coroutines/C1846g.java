            package kotlin.coroutines;

            import java.io.Serializable;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: renamed from: kotlin.coroutines.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1846g implements CoroutineContext, Serializable {

                /* JADX INFO: renamed from: a */
                public static final C1846g f12919a = new C1846g();

                private final Object readResolve() {
/* 1 */             return f12919a;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 1 */             return obj;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
/* 4 */             return null;
                }

                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
/* 4 */             return this;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 1 */             coroutineContext.getClass();
/* 4 */             return coroutineContext;
                }

                public final String toString() {
/* 1 */             return "EmptyCoroutineContext";
                }
            }
