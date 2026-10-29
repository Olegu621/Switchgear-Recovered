            package io.sentry;

            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1628y;
            
            /* JADX INFO: renamed from: io.sentry.r6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1645r6 implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final String f11576a;

                /* JADX INFO: renamed from: b */
                public final String f11577b;

                public C1645r6() {
/* 3 */             String property = System.getProperty("java.version");
/* 9 */             String property2 = System.getProperty("java.vendor");
/* 16 */            this.f11576a = property;
/* 18 */            this.f11577b = property2;
                }

                /* JADX INFO: renamed from: a */
                public final void m5402a(AbstractC1635q4 abstractC1635q4) {
/* 1 */             C1597e c1597e = abstractC1635q4.f11517b;
/* 7 */             if (c1597e.mo5312h() == null) {
/* 14 */                c1597e.mo5324t(new C1628y());
                    }
/* 17 */            C1628y c1628yMo5312h = c1597e.mo5312h();
/* 21 */            if (c1628yMo5312h != null && c1628yMo5312h.f11483a == null && c1628yMo5312h.f11484b == null) {
/* 33 */                c1628yMo5312h.f11483a = this.f11577b;
/* 37 */                c1628yMo5312h.f11484b = this.f11576a;
                    }
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
/* 1 */             m5402a(c1393c5);
/* 4 */             return c1393c5;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
/* 1 */             m5402a(c1600f0);
/* 4 */             return c1600f0;
                }
            }
