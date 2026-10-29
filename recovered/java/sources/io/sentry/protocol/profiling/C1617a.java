            package io.sentry.protocol.profiling;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.profiling.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1617a implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public List f11424a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public List f11425b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public List f11426c = new ArrayList();

                /* JADX INFO: renamed from: d */
                public Map f11427d = new HashMap();

                /* JADX INFO: renamed from: e */
                public ConcurrentHashMap f11428e;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("samples");
/* 13 */            c1505c.m5297v(iLogger, this.f11424a);
/* 18 */            c1505c.m5291p("stacks");
/* 23 */            c1505c.m5297v(iLogger, this.f11425b);
/* 28 */            c1505c.m5291p("frames");
/* 33 */            c1505c.m5297v(iLogger, this.f11426c);
/* 38 */            c1505c.m5291p("thread_metadata");
/* 43 */            c1505c.m5297v(iLogger, this.f11427d);
/* 46 */            ConcurrentHashMap concurrentHashMap = this.f11428e;
/* 48 */            if (concurrentHashMap != null) {
/* 62 */                for (String str : concurrentHashMap.keySet()) {
/* 72 */                    AbstractC0298j.m1863d(this.f11428e, str, c1505c, str, iLogger);
                        }
                    }
/* 76 */            c1505c.m5288l();
                }
            }
