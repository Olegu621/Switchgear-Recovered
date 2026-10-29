            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.Date;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.v4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1726v4 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final C1626w f11760a;

                /* JADX INFO: renamed from: b */
                public final C1624u f11761b;

                /* JADX INFO: renamed from: c */
                public final C1472h7 f11762c;

                /* JADX INFO: renamed from: d */
                public Date f11763d;

                /* JADX INFO: renamed from: e */
                public HashMap f11764e;

                public C1726v4(C1626w c1626w, C1624u c1624u, C1472h7 c1472h7) {
/* 4 */             this.f11760a = c1626w;
/* 6 */             this.f11761b = c1624u;
/* 8 */             this.f11762c = c1472h7;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 6 */             C1626w c1626w = this.f11760a;
/* 8 */             if (c1626w != null) {
/* 12 */                c1505c.m5291p("event_id");
/* 15 */                c1505c.m5297v(iLogger, c1626w);
                    }
/* 18 */            C1624u c1624u = this.f11761b;
/* 20 */            if (c1624u != null) {
/* 24 */                c1505c.m5291p("sdk");
/* 27 */                c1505c.m5297v(iLogger, c1624u);
                    }
/* 30 */            C1472h7 c1472h7 = this.f11762c;
/* 32 */            if (c1472h7 != null) {
/* 36 */                c1505c.m5291p("trace");
/* 39 */                c1505c.m5297v(iLogger, c1472h7);
                    }
/* 44 */            if (this.f11763d != null) {
/* 48 */                c1505c.m5291p("sent_at");
/* 61 */                c1505c.m5297v(iLogger, AbstractC1417a.m5178q(this.f11763d.getTime()));
                    }
/* 64 */            HashMap map = this.f11764e;
/* 66 */            if (map != null) {
/* 80 */                for (String str : map.keySet()) {
/* 90 */                    AbstractC0298j.m1862c(this.f11764e, str, c1505c, str, iLogger);
                        }
                    }
/* 94 */            c1505c.m5288l();
                }
            }
