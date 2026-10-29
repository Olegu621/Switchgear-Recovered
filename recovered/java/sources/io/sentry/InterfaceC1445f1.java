            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1690p;
            
            /* JADX INFO: renamed from: io.sentry.f1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InterfaceC1445f1 {
                /* JADX INFO: renamed from: a */
                void mo5215a(boolean z);

                /* JADX INFO: renamed from: b */
                void mo5216b(long j);

                /* JADX INFO: renamed from: c */
                void mo5217c(C1764z6 c1764z6, C1486i0 c1486i0);

                /* JADX INFO: renamed from: d */
                C1690p mo5218d();

                /* JADX INFO: renamed from: e */
                default boolean mo5219e() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: g */
                C1626w mo5220g(C1576o6 c1576o6, InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0);

                /* JADX INFO: renamed from: h */
                C1626w mo5221h(C1505c c1505c, C1486i0 c1486i0);

                /* JADX INFO: renamed from: i */
                void mo5222i(C1575o5 c1575o5, InterfaceC1156a1 interfaceC1156a1);

                boolean isEnabled();

                /* JADX INFO: renamed from: j */
                C1626w mo5223j(C1573o3 c1573o3);

                /* JADX INFO: renamed from: k */
                C1626w mo5224k(C1600f0 c1600f0, C1472h7 c1472h7, InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0, C1642r3 c1642r3);

                /* JADX INFO: renamed from: l */
                C1626w mo5225l(C1609k c1609k, InterfaceC1156a1 interfaceC1156a1);

                /* JADX INFO: renamed from: m */
                C1626w mo5226m(C1393c5 c1393c5, InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0);
            }
