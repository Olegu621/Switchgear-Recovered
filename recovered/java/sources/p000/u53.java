            package p000;

            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u53 extends am0 {

                /* JADX INFO: renamed from: b */
                public final String f17365b;

                /* JADX INFO: renamed from: c */
                public int f17366c;

                public u53(InterfaceC2469xp interfaceC2469xp) {
/* 1 */             super(interfaceC2469xp);
/* 38 */            this.f17365b = "virtual-" + interfaceC2469xp.mo310b() + "-" + UUID.randomUUID().toString();
                }

                @Override // p000.am0, p000.InterfaceC2469xp
                /* JADX INFO: renamed from: a */
                public final int mo309a() {
/* 2 */             return mo313e(0);
                }

                @Override // p000.am0, p000.InterfaceC2469xp
                /* JADX INFO: renamed from: b */
                public final String mo310b() {
/* 1 */             return this.f17365b;
                }

                @Override // p000.am0, p000.InterfaceC2469xp
                /* JADX INFO: renamed from: e */
                public final int mo313e(int i) {
/* 10 */            return cr2.m2876f(this.f334a.mo313e(i) - this.f17366c);
                }
            }
