            package p000;

            import kotlin.coroutines.C1842c;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: renamed from: dx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final /* synthetic */ class C0859dx implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7436a;

                public /* synthetic */ C0859dx(int i) {
/* 1 */             this.f7436a = i;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1842c c1842c;
                    switch (this.f7436a) {
                        case 0:
/* 71 */                    String str = (String) obj;
/* 73 */                    CoroutineContext.Element element = (CoroutineContext.Element) obj2;
/* 75 */                    str.getClass();
/* 78 */                    element.getClass();
/* 85 */                    if (str.length() == 0) {
/* 87 */                        return element.toString();
                            }
/* 108 */                   return str + ", " + element;
                        default:
/* 6 */                     CoroutineContext coroutineContext = (CoroutineContext) obj;
/* 8 */                     CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
/* 10 */                    coroutineContext.getClass();
/* 13 */                    element2.getClass();
/* 20 */                    CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element2.getKey());
/* 24 */                    C1846g c1846g = C1846g.f12919a;
/* 26 */                    if (coroutineContextMinusKey == c1846g) {
/* 70 */                        return element2;
                            }
/* 29 */                    e10 e10Var = InterfaceC1843d.f12918S;
/* 35 */                    InterfaceC1843d interfaceC1843d = (InterfaceC1843d) coroutineContextMinusKey.get(e10Var);
/* 37 */                    if (interfaceC1843d == null) {
/* 41 */                        c1842c = new C1842c(element2, coroutineContextMinusKey);
                            } else {
/* 46 */                        CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(e10Var);
/* 50 */                        if (coroutineContextMinusKey2 == c1846g) {
/* 54 */                            return new C1842c(interfaceC1843d, element2);
                                }
/* 66 */                        c1842c = new C1842c(interfaceC1843d, new C1842c(element2, coroutineContextMinusKey2));
                            }
/* 44 */                    return c1842c;
                    }
                }
            }
