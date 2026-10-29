            package p000;

            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: tn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC2224tn implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17189a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0875ec f17190b;

                public /* synthetic */ RunnableC2224tn(C0875ec c0875ec, int i) {
/* 1 */             this.f17189a = i;
/* 3 */             this.f17190b = c0875ec;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17189a;
/* 3 */             C0875ec c0875ec = this.f17190b;
                    switch (i) {
                        case 0:
/* 85 */                    int i2 = 1;
/* 90 */                    if (!((AtomicBoolean) c0875ec.f7614c).getAndSet(true)) {
/* 108 */                       ((C2467xn) ((C0210cb) c0875ec.f7615d).f2805c).f19263c.execute(new RunnableC2224tn(c0875ec, i2));
                                break;
                            }
                            break;
                        default:
/* 16 */                    int i3 = ((C2467xn) ((C0210cb) c0875ec.f7615d).f2805c).f19284s0;
/* 20 */                    C0210cb c0210cb = (C0210cb) c0875ec.f7615d;
/* 24 */                    if (i3 == 8) {
/* 52 */                        ((C2467xn) c0210cb.f2805c).m10000s("Camera onError timeout, reopen it.");
/* 64 */                        ((C2467xn) ((C0210cb) c0875ec.f7615d).f2805c).m9985E(7);
/* 77 */                        ((C2467xn) ((C0210cb) c0875ec.f7615d).f2805c).f19285v.m9587b();
                            } else {
/* 28 */                        C2467xn c2467xn = (C2467xn) c0210cb.f2805c;
/* 42 */                        c2467xn.m10000s("Camera skip reopen at state: ".concat(AbstractC0886en.m3492A(c2467xn.f19284s0)));
                            }
                            break;
                    }
                }
            }
