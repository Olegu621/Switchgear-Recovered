            package io.sentry;

            import java.util.ListIterator;
            import p000.C2076pn;
            
            /* JADX INFO: renamed from: io.sentry.u6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1701u6 implements InterfaceC1427d4, InterfaceC1395c7 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1748x6 f11722a;

                public /* synthetic */ C1701u6(C1748x6 c1748x6) {
/* 1 */             this.f11722a = c1748x6;
                }

                @Override // io.sentry.InterfaceC1395c7
                /* JADX INFO: renamed from: b */
                public void mo5112b(C1162a7 c1162a7) {
/* 1 */             C1748x6 c1748x6 = this.f11722a;
/* 3 */             InterfaceC1547m interfaceC1547m = c1748x6.f11834q;
/* 5 */             if (interfaceC1547m != null) {
/* 7 */                 interfaceC1547m.mo5350b(c1162a7);
                    }
/* 10 */            C1740w6 c1740w6 = c1748x6.f11823f;
/* 12 */            C1531k7 c1531k7 = c1748x6.f11835r;
/* 16 */            if (c1531k7.f11096g == null) {
/* 55 */                if (c1740w6.f11806a) {
/* 60 */                    c1748x6.mo4740v(c1740w6.f11807b, null);
/* 63 */                    return;
                        }
/* 63 */                return;
                    }
/* 20 */            if (c1531k7.f11095f) {
/* 24 */                ListIterator listIterator = c1748x6.f11820c.listIterator();
/* 32 */                while (listIterator.hasNext()) {
/* 38 */                    C1162a7 c1162a8 = (C1162a7) listIterator.next();
/* 42 */                    if (!c1162a8.f9808g && c1162a8.f9803b == null) {
/* 48 */                        return;
                            }
                        }
                    }
/* 49 */            c1748x6.mo5251q();
                }

                @Override // io.sentry.InterfaceC1427d4
                /* JADX INFO: renamed from: e */
                public void mo4804e(InterfaceC1156a1 interfaceC1156a1) {
/* 10 */            interfaceC1156a1.mo4683G(new C2076pn(19, this.f11722a, interfaceC1156a1));
                }
            }
