            package p000;

            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n10 extends b51 implements Function2 {

                /* JADX INFO: renamed from: a */
                public static final n10 f14091a = new n10(2);

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 5 */             return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
                }
            }
