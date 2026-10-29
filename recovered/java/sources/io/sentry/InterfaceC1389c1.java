            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.logger.InterfaceC1541a;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1690p;
            import p000.C2076pn;
            
            /* JADX INFO: renamed from: io.sentry.c1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InterfaceC1389c1 {
                /* JADX INFO: renamed from: A */
                C1626w mo5079A(C1609k c1609k);

                /* JADX INFO: renamed from: B */
                C1626w mo5080B(C1393c5 c1393c5, C1486i0 c1486i0);

                /* JADX INFO: renamed from: a */
                void mo5081a(boolean z);

                /* JADX INFO: renamed from: b */
                void mo5082b(long j);

                /* JADX INFO: renamed from: c */
                void mo5083c(Throwable th, C1162a7 c1162a7, String str);

                InterfaceC1722v0 clone();

                /* JADX INFO: renamed from: d */
                C1690p mo5084d();

                /* JADX INFO: renamed from: e */
                boolean mo5085e();

                /* JADX INFO: renamed from: f */
                void mo5086f(C1443f c1443f, C1486i0 c1486i0);

                /* JADX INFO: renamed from: g */
                InterfaceC1525k1 mo5087g();

                /* JADX INFO: renamed from: h */
                C1626w mo5088h(C1505c c1505c, C1486i0 c1486i0);

                /* JADX INFO: renamed from: i */
                void mo5089i(C1443f c1443f);

                boolean isEnabled();

                /* JADX INFO: renamed from: j */
                C1626w mo5090j(C1573o3 c1573o3);

                /* JADX INFO: renamed from: k */
                void mo5091k(C2076pn c2076pn);

                /* JADX INFO: renamed from: l */
                C1554m6 mo5092l();

                /* JADX INFO: renamed from: m */
                InterfaceC1549m1 mo5093m();

                /* JADX INFO: renamed from: n */
                void mo5094n();

                /* JADX INFO: renamed from: o */
                void mo5095o();

                /* JADX INFO: renamed from: p */
                default C1626w mo5096p(C1609k c1609k) {
/* 1 */             return mo5079A(c1609k);
                }

                /* JADX INFO: renamed from: q */
                InterfaceC1549m1 mo5097q(C1522j7 c1522j7, C1531k7 c1531k7);

                /* JADX INFO: renamed from: r */
                void mo5098r(InterfaceC1427d4 interfaceC1427d4);

                /* JADX INFO: renamed from: s */
                default boolean mo5099s() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: t */
                InterfaceC1541a mo5100t();

                /* JADX INFO: renamed from: u */
                C1626w mo5101u(C1576o6 c1576o6, C1486i0 c1486i0);

                /* JADX INFO: renamed from: v */
                InterfaceC1156a1 mo5102v();

                /* JADX INFO: renamed from: w */
                InterfaceC1695u0 mo5103w();

                /* JADX INFO: renamed from: x */
                C1626w mo5104x(Exception exc, C1486i0 c1486i0);

                /* JADX INFO: renamed from: y */
                C1626w mo5105y(C1600f0 c1600f0, C1472h7 c1472h7, C1486i0 c1486i0, C1642r3 c1642r3);

                /* JADX INFO: renamed from: z */
                InterfaceC1389c1 mo5106z(String str);
            }
