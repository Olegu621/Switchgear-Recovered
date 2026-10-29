            package io.sentry;
            
            /* JADX INFO: renamed from: io.sentry.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1659s implements InterfaceC1424d1 {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f11639a = new ThreadLocal();

                @Override // io.sentry.InterfaceC1424d1
                /* JADX INFO: renamed from: a */
                public final InterfaceC1466h1 mo5190a(InterfaceC1389c1 interfaceC1389c1) {
/* 1 */             InterfaceC1389c1 interfaceC1389c2 = get();
/* 7 */             f11639a.set(interfaceC1389c1);
/* 12 */            return new C1638r(interfaceC1389c2);
                }

                @Override // io.sentry.InterfaceC1424d1
                public final void close() {
/* 3 */             f11639a.remove();
                }

                @Override // io.sentry.InterfaceC1424d1
                public final InterfaceC1389c1 get() {
/* 7 */             return (InterfaceC1389c1) f11639a.get();
                }
            }
