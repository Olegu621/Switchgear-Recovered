            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1595d implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11290a;

                /* JADX INFO: renamed from: b */
                public String f11291b;

                /* JADX INFO: renamed from: c */
                public ConcurrentHashMap f11292c;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1595d.class == obj.getClass()) {
/* 17 */                C1595d c1595d = (C1595d) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11290a, c1595d.f11290a) && AbstractC1704c.m5453h(this.f11291b, c1595d.f11291b)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f11290a, this.f11291b});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11290a != null) {
/* 12 */                c1505c.m5291p("name");
/* 17 */                c1505c.m5300y(this.f11290a);
                    }
/* 22 */            if (this.f11291b != null) {
/* 26 */                c1505c.m5291p("version");
/* 31 */                c1505c.m5300y(this.f11291b);
                    }
/* 34 */            ConcurrentHashMap concurrentHashMap = this.f11292c;
/* 36 */            if (concurrentHashMap != null) {
/* 50 */                for (String str : concurrentHashMap.keySet()) {
/* 60 */                    AbstractC0298j.m1863d(this.f11292c, str, c1505c, str, iLogger);
                        }
                    }
/* 64 */            c1505c.m5288l();
                }
            }
