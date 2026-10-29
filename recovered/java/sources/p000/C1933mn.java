            package p000;

            import java.util.ArrayList;
            import java.util.concurrent.RejectedExecutionException;
            
            /* JADX INFO: renamed from: mn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1933mn implements InterfaceC2299vm {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13866a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2467xn f13867b;

                public /* synthetic */ C1933mn(C2467xn c2467xn, int i) {
/* 1 */             this.f13866a = i;
/* 3 */             this.f13867b = c2467xn;
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
/* 1 */             int i = this.f13866a;
/* 3 */             C2467xn c2467xn = this.f13867b;
                    switch (i) {
                        case 0:
                            try {
/* 98 */                        c2467xn.f19263c.execute(new RunnableC1784j8(7, c2467xn, c2260um));
/* 112 */                       return "isMeteringRepeatingAttached";
                            } catch (RejectedExecutionException unused) {
/* 109 */                       c2260um.m9041b(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
/* 112 */                       return "isMeteringRepeatingAttached";
                            }
                        default:
                            try {
/* 22 */                        ArrayList arrayList = new ArrayList(c2467xn.f19259a.m3816m().m3358b().f8116c);
/* 31 */                        arrayList.add((C2152rp) c2467xn.f19274i0.f15577f);
/* 39 */                        arrayList.add(new C2113qn(c2467xn, c2260um));
/* 56 */                        c2467xn.f19261b.f6873a.mo1571E(c2467xn.f19286w.f20267a, c2467xn.f19263c, kb1.m6066s(arrayList));
/* 87 */                        return "configAndCloseTask";
                            } catch (SecurityException | C1897lo e) {
/* 81 */                        c2467xn.m10000s("Unable to open camera for configAndClose: " + e.getMessage());
/* 84 */                        c2260um.m9041b(e);
/* 87 */                        return "configAndCloseTask";
                            }
                    }
                }
            }
