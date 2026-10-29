            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1607j implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final List f11359a;

                /* JADX INFO: renamed from: b */
                public ConcurrentHashMap f11360b;

                public C1607j(List list) {
/* 4 */             this.f11359a = list;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || C1607j.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return AbstractC1704c.m5453h(this.f11359a, ((C1607j) obj).f11359a);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f11359a});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("values");
/* 13 */            c1505c.m5297v(iLogger, this.f11359a);
/* 16 */            ConcurrentHashMap concurrentHashMap = this.f11360b;
/* 18 */            if (concurrentHashMap != null) {
/* 32 */                for (String str : concurrentHashMap.keySet()) {
/* 42 */                    AbstractC0298j.m1863d(this.f11360b, str, c1505c, str, iLogger);
                        }
                    }
/* 46 */            c1505c.m5288l();
                }
            }
