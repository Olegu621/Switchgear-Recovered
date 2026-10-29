            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1616p implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11420a;

                /* JADX INFO: renamed from: b */
                public String f11421b;

                /* JADX INFO: renamed from: c */
                public List f11422c;

                /* JADX INFO: renamed from: d */
                public ConcurrentHashMap f11423d;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11420a != null) {
/* 12 */                c1505c.m5291p("formatted");
/* 17 */                c1505c.m5300y(this.f11420a);
                    }
/* 22 */            if (this.f11421b != null) {
/* 26 */                c1505c.m5291p("message");
/* 31 */                c1505c.m5300y(this.f11421b);
                    }
/* 34 */            List list = this.f11422c;
/* 36 */            if (list != null && !list.isEmpty()) {
/* 46 */                c1505c.m5291p("params");
/* 51 */                c1505c.m5297v(iLogger, this.f11422c);
                    }
/* 54 */            ConcurrentHashMap concurrentHashMap = this.f11423d;
/* 56 */            if (concurrentHashMap != null) {
/* 70 */                for (String str : concurrentHashMap.keySet()) {
/* 80 */                    AbstractC0298j.m1863d(this.f11423d, str, c1505c, str, iLogger);
                        }
                    }
/* 84 */            c1505c.m5288l();
                }
            }
