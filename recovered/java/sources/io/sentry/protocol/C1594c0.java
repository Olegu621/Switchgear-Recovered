            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.c0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1594c0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public List f11285a;

                /* JADX INFO: renamed from: b */
                public AbstractMap f11286b;

                /* JADX INFO: renamed from: c */
                public Boolean f11287c;

                /* JADX INFO: renamed from: d */
                public EnumC1592b0 f11288d;

                /* JADX INFO: renamed from: e */
                public ConcurrentHashMap f11289e;

                public C1594c0(List list) {
/* 4 */             this.f11285a = list;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11285a != null) {
/* 12 */                c1505c.m5291p("frames");
/* 17 */                c1505c.m5297v(iLogger, this.f11285a);
                    }
/* 22 */            if (this.f11286b != null) {
/* 26 */                c1505c.m5291p("registers");
/* 31 */                c1505c.m5297v(iLogger, this.f11286b);
                    }
/* 36 */            if (this.f11287c != null) {
/* 40 */                c1505c.m5291p("snapshot");
/* 45 */                c1505c.m5298w(this.f11287c);
                    }
/* 50 */            if (this.f11288d != null) {
/* 54 */                c1505c.m5291p("instruction_addr_adjustment");
/* 59 */                c1505c.m5297v(iLogger, this.f11288d);
                    }
/* 62 */            ConcurrentHashMap concurrentHashMap = this.f11289e;
/* 64 */            if (concurrentHashMap != null) {
/* 78 */                for (String str : concurrentHashMap.keySet()) {
/* 88 */                    AbstractC0298j.m1863d(this.f11289e, str, c1505c, str, iLogger);
                        }
                    }
/* 92 */            c1505c.m5288l();
                }
            }
