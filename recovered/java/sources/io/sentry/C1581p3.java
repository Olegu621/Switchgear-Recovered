            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.p3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1581p3 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public C1626w f11225a;

                /* JADX INFO: renamed from: b */
                public ConcurrentHashMap f11226b;

                public C1581p3(C1626w c1626w) {
/* 4 */             this.f11225a = c1626w;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof C1581p3) {
/* 17 */                return this.f11225a.equals(((C1581p3) obj).f11225a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f11225a});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("profiler_id");
/* 13 */            c1505c.m5297v(iLogger, this.f11225a);
/* 16 */            ConcurrentHashMap concurrentHashMap = this.f11226b;
/* 18 */            if (concurrentHashMap != null) {
/* 32 */                for (String str : concurrentHashMap.keySet()) {
/* 42 */                    AbstractC0298j.m1863d(this.f11226b, str, c1505c, str, iLogger);
                        }
                    }
/* 46 */            c1505c.m5288l();
                }
            }
