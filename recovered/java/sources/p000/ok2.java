            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ok2 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14789a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qk2 f14790b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ok2(qk2 qk2Var, int i) {
/* 6 */             super(1);
/* 1 */             this.f14789a = i;
/* 3 */             this.f14790b = qk2Var;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 3 */             int i = 1;
                    switch (this.f14789a) {
                        case 0:
/* 33 */                    ((Unit) obj).getClass();
/* 36 */                    qk2 qk2Var = this.f14790b;
/* 42 */                    C1945mz c1945mz = (C1945mz) qk2Var.f15601d;
/* 52 */                    c1945mz.f14069a.m9743b(new C2107qh(c1945mz, kz2.TCF_STRING_CHANGE, null, i));
/* 60 */                    qk2Var.f15606i.f9528b++;
                            break;
                        default:
/* 7 */                     Throwable th = (Throwable) obj;
/* 9 */                     th.getClass();
/* 12 */                    qk2 qk2Var2 = this.f14790b;
/* 18 */                    qk2Var2.f15598a.mo2907b("Failed while trying to updateTCString method", th);
/* 26 */                    qk2Var2.f15606i.f9528b++;
                            break;
                    }
/* 28 */            return Unit.f12910a;
                }
            }
