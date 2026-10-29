            package p000;

            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class q10 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public static final q10 f15365a = new q10(1);

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             CoroutineContext.Element element = (CoroutineContext.Element) obj;
/* 5 */             if (element instanceof s10) {
/* 7 */                 return (s10) element;
                    }
/* 10 */            return null;
                }
            }
