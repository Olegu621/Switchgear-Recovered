            package kotlin.coroutines;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m6176d2 = {"Lkotlin/coroutines/CoroutineContext;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin/coroutines/f", "Element", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public interface CoroutineContext {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m6176d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
                public interface Element extends CoroutineContext {
                    InterfaceC1845f getKey();
                }

                Object fold(Object obj, Function2 function2);

                Element get(InterfaceC1845f interfaceC1845f);

                CoroutineContext minusKey(InterfaceC1845f interfaceC1845f);

                CoroutineContext plus(CoroutineContext coroutineContext);
            }
