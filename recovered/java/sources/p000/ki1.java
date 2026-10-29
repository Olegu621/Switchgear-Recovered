            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ki1 extends AbstractC1934mo {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12788a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f12789b;

                public /* synthetic */ ki1(Object obj, int i) {
/* 1 */             this.f12788a = i;
/* 3 */             this.f12789b = obj;
                }

                @Override // p000.AbstractC1934mo
                /* JADX INFO: renamed from: b */
                public final void mo3975b(int i, InterfaceC2188so interfaceC2188so) {
                    switch (this.f12788a) {
                        case 0:
/* 68 */                    li1 li1Var = (li1) this.f12789b;
                            synchronized (li1Var.f13304a) {
                                try {
/* 75 */                            if (li1Var.f13308e) {
/* 99 */                                return;
                                    }
/* 92 */                            li1Var.f13312w.put(interfaceC2188so.mo1581b(), new C2225to(interfaceC2188so));
/* 95 */                            li1Var.m6457j();
/* 99 */                            return;
                                } catch (Throwable th) {
/* 101 */                           throw th;
                                }
                            }
                        default:
/* 12 */                    Iterator it = ((s53) this.f12789b).f16439a.iterator();
/* 20 */                    while (it.hasNext()) {
/* 28 */                        fb2 fb2Var = ((wy2) it.next()).f18868m;
/* 34 */                        Iterator it2 = fb2Var.f8120g.f12444d.iterator();
/* 42 */                        while (it2.hasNext()) {
/* 61 */                            ((AbstractC1934mo) it2.next()).mo3975b(i, new hh2(interfaceC2188so, -1L, fb2Var.f8120g.f12446f));
                                }
                            }
/* 65 */                    return;
                    }
                }
            }
