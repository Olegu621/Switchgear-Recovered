            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1611l implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11379a;

                /* JADX INFO: renamed from: b */
                public String f11380b;

                /* JADX INFO: renamed from: c */
                public String f11381c;

                /* JADX INFO: renamed from: d */
                public ConcurrentHashMap f11382d;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11379a != null) {
/* 12 */                c1505c.m5291p("city");
/* 17 */                c1505c.m5300y(this.f11379a);
                    }
/* 22 */            if (this.f11380b != null) {
/* 26 */                c1505c.m5291p("country_code");
/* 31 */                c1505c.m5300y(this.f11380b);
                    }
/* 36 */            if (this.f11381c != null) {
/* 40 */                c1505c.m5291p("region");
/* 45 */                c1505c.m5300y(this.f11381c);
                    }
/* 48 */            ConcurrentHashMap concurrentHashMap = this.f11382d;
/* 50 */            if (concurrentHashMap != null) {
/* 64 */                for (String str : concurrentHashMap.keySet()) {
/* 74 */                    AbstractC0298j.m1863d(this.f11382d, str, c1505c, str, iLogger);
                        }
                    }
/* 78 */            c1505c.m5288l();
                }
            }
