            package kotlin.coroutines;

            import kotlin.jvm.internal.Intrinsics;
            import p000.C0859dx;
            
            /* JADX INFO: renamed from: kotlin.coroutines.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1844e {
                /* JADX INFO: renamed from: a */
                public static CoroutineContext.Element m6213a(CoroutineContext.Element element, InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
/* 12 */            if (Intrinsics.m6216a(element.getKey(), interfaceC1845f)) {
/* 14 */                return element;
                    }
/* 15 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public static CoroutineContext m6214b(CoroutineContext.Element element, InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
                    return Intrinsics.m6216a(element.getKey(), interfaceC1845f) ? C1846g.f12919a : element;
                }

                /* JADX INFO: renamed from: c */
                public static CoroutineContext m6215c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
/* 1 */             coroutineContext.getClass();
                    return coroutineContext == C1846g.f12919a ? element : (CoroutineContext) coroutineContext.fold(element, new C0859dx(1));
                }
            }
