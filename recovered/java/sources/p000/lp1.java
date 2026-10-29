            package p000;

            import java.util.ListIterator;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lp1 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13442a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ sp1 f13443b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ lp1(sp1 sp1Var, int i) {
/* 6 */             super(1);
/* 1 */             this.f13442a = i;
/* 3 */             this.f13443b = sp1Var;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0063  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    kp1 kp1Var;
/* 1 */             int i = this.f13442a;
/* 3 */             Object obj2 = null;
/* 4 */             sp1 sp1Var = this.f13443b;
                    switch (i) {
                        case 0:
/* 59 */                    C0917fh c0917fh = (C0917fh) obj;
/* 61 */                    c0917fh.getClass();
/* 64 */                    C0840dd c0840dd = sp1Var.f16739b;
/* 70 */                    ListIterator listIterator = c0840dd.listIterator(c0840dd.mo0a());
/* 78 */                    while (listIterator.hasPrevious()) {
/* 80 */                        Object objPrevious = listIterator.previous();
/* 91 */                        if (((kp1) objPrevious).isEnabled()) {
/* 93 */                            obj2 = objPrevious;
/* 94 */                            kp1Var = (kp1) obj2;
/* 96 */                            sp1Var.f16740c = kp1Var;
/* 98 */                            if (kp1Var != null) {
/* 100 */                               kp1Var.handleOnBackStarted(c0917fh);
                                    }
                                    break;
                                }
                            }
/* 94 */                    kp1Var = (kp1) obj2;
/* 96 */                    sp1Var.f16740c = kp1Var;
/* 98 */                    if (kp1Var != null) {
/* 100 */                       kp1Var.handleOnBackStarted(c0917fh);
                            }
                            break;
                        default:
/* 9 */                     C0917fh c0917fh2 = (C0917fh) obj;
/* 11 */                    c0917fh2.getClass();
/* 14 */                    kp1 kp1Var2 = sp1Var.f16740c;
/* 16 */                    if (kp1Var2 == null) {
/* 18 */                        C0840dd c0840dd2 = sp1Var.f16739b;
/* 24 */                        ListIterator listIterator2 = c0840dd2.listIterator(c0840dd2.mo0a());
/* 32 */                        while (listIterator2.hasPrevious()) {
/* 34 */                            Object objPrevious2 = listIterator2.previous();
/* 45 */                            if (((kp1) objPrevious2).isEnabled()) {
/* 47 */                                obj2 = objPrevious2;
/* 49 */                                kp1Var2 = (kp1) obj2;
                                    }
                                }
/* 49 */                        kp1Var2 = (kp1) obj2;
                            }
/* 51 */                    if (kp1Var2 != null) {
/* 53 */                        kp1Var2.handleOnBackProgressed(c0917fh2);
                            }
                            break;
                    }
/* 56 */            return Unit.f12910a;
                }
            }
