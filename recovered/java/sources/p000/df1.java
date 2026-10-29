            package p000;

            import io.sentry.C1536l3;
            import io.sentry.C1577p;
            import io.sentry.C1630q;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1750y0;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.TimerTask;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class df1 extends TimerTask {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7157a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f7158b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f7159c;

                public df1(ef1 ef1Var, C0908f8 c0908f8) {
/* 4 */             this.f7158b = ef1Var;
/* 6 */             this.f7159c = c0908f8;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7157a;
/* 3 */             Object obj = this.f7159c;
/* 5 */             Object obj2 = this.f7158b;
                    switch (i) {
                        case 0:
/* 142 */                   ef1 ef1Var = (ef1) obj2;
/* 144 */                   Boolean bool = ef1Var.f7667b;
/* 146 */                   Boolean bool2 = Boolean.TRUE;
/* 152 */                   if (!Intrinsics.m6216a(bool, bool2) || ef1Var.f7668c < ef1Var.f7669d) {
/* 166 */                       if (Intrinsics.m6216a(ef1Var.f7667b, bool2)) {
/* 172 */                           ef1Var.f7668c++;
                                }
/* 176 */                       ((C0908f8) obj).invoke();
                            }
                            break;
                        default:
/* 10 */                    ArrayList arrayList = (ArrayList) obj2;
/* 12 */                    arrayList.clear();
/* 17 */                    C1630q c1630q = (C1630q) obj;
/* 33 */                    C1536l3 c1536l3 = new C1536l3(c1630q.f11506g.getDateProvider().mo4856a().mo5278d());
/* 38 */                    Iterator it = c1630q.f11503d.iterator();
/* 46 */                    while (it.hasNext()) {
/* 54 */                        ((InterfaceC1750y0) it.next()).mo4805a(c1536l3);
                            }
/* 72 */                    for (C1577p c1577p : c1630q.f11502c.values()) {
/* 80 */                        ArrayList arrayList2 = c1577p.f11220a;
/* 82 */                        InterfaceC1549m1 interfaceC1549m1 = c1577p.f11221b;
/* 84 */                        arrayList2.add(c1536l3);
/* 87 */                        if (interfaceC1549m1 != null && c1577p.f11223d.f11506g.getDateProvider().mo4856a().mo5278d() > c1577p.f11222c + 30000000000L) {
/* 117 */                           arrayList.add(interfaceC1549m1);
                                }
                            }
/* 121 */                   Iterator it2 = arrayList.iterator();
/* 129 */                   while (it2.hasNext()) {
/* 137 */                       c1630q.mo5354f((InterfaceC1549m1) it2.next());
                            }
                            break;
                    }
                }

/* 11 */        public df1(C1630q c1630q, ArrayList arrayList) {
/* 12 */            this.f7159c = c1630q;
                    this.f7158b = arrayList;
                }
            }
