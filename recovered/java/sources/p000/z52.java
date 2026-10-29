            package p000;

            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class z52 extends b51 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ w52 f19942a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public z52(w52 w52Var) {
/* 4 */             super(2);
/* 1 */             this.f19942a = w52Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int iIntValue = ((Number) obj).intValue();
/* 7 */             CoroutineContext.Element element = (CoroutineContext.Element) obj2;
/* 9 */             InterfaceC1845f key = element.getKey();
/* 17 */            CoroutineContext.Element element2 = this.f19942a.f18445b.get(key);
/* 23 */            if (key != xt0.f19368w) {
/* 32 */                return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : iIntValue + 1);
                    }
/* 37 */            h01 h01Var = (h01) element2;
/* 39 */            h01 parent = (h01) element;
                    while (true) {
/* 42 */                if (parent != null) {
/* 46 */                    if (parent == h01Var || !(parent instanceof p72)) {
                                break;
                            }
/* 104 */                   InterfaceC2563zt interfaceC2563ztM10259w = ((z01) parent).m10259w();
/* 115 */                   parent = interfaceC2563ztM10259w != null ? interfaceC2563ztM10259w.getParent() : null;
                        } else {
/* 44 */                    parent = null;
                            break;
                        }
                    }
/* 53 */            if (parent == h01Var) {
/* 55 */                if (h01Var != null) {
/* 58 */                    iIntValue++;
                        }
/* 60 */                return Integer.valueOf(iIntValue);
                    }
/* 101 */           throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + h01Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
            }
