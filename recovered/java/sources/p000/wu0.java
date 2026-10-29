            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wu0 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18817a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0890er f18818b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ wu0(C0890er c0890er, int i) {
/* 6 */             super(1);
/* 1 */             this.f18817a = i;
/* 3 */             this.f18818b = c0890er;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f18817a;
/* 3 */             C0890er c0890er = this.f18818b;
                    switch (i) {
                        case 0:
/* 31 */                    Throwable th = (Throwable) obj;
/* 33 */                    th.getClass();
/* 36 */                    m42 m42Var = o42.f14612b;
/* 43 */                    c0890er.resumeWith(new n42(th));
/* 46 */                    return Unit.f12910a;
                        case 1:
/* 18 */                    zu0 zu0Var = (zu0) obj;
/* 20 */                    zu0Var.getClass();
/* 23 */                    m42 m42Var2 = o42.f14612b;
/* 25 */                    c0890er.resumeWith(zu0Var);
/* 28 */                    return Unit.f12910a;
                        default:
/* 10 */                    m42 m42Var3 = o42.f14612b;
/* 12 */                    Unit unit = Unit.f12910a;
/* 14 */                    c0890er.resumeWith(unit);
/* 17 */                    return unit;
                    }
                }
            }
