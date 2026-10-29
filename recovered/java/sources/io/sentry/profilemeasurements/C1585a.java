            package io.sentry.profilemeasurements;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.profilemeasurements.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1585a implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public ConcurrentHashMap f11230a;

                /* JADX INFO: renamed from: b */
                public String f11231b;

                /* JADX INFO: renamed from: c */
                public Collection f11232c;

                public C1585a(String str, AbstractCollection abstractCollection) {
/* 4 */             this.f11231b = str;
/* 6 */             this.f11232c = abstractCollection;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 57 */                return true;
                    }
/* 4 */             if (obj == null || C1585a.class != obj.getClass()) {
/* 59 */                return false;
                    }
/* 15 */            C1585a c1585a = (C1585a) obj;
                    return AbstractC1704c.m5453h(this.f11230a, c1585a.f11230a) && this.f11231b.equals(c1585a.f11231b) && new ArrayList(this.f11232c).equals(new ArrayList(c1585a.f11232c));
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{this.f11230a, this.f11231b, this.f11232c});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("unit");
/* 13 */            c1505c.m5297v(iLogger, this.f11231b);
/* 18 */            c1505c.m5291p("values");
/* 23 */            c1505c.m5297v(iLogger, this.f11232c);
/* 26 */            ConcurrentHashMap concurrentHashMap = this.f11230a;
/* 28 */            if (concurrentHashMap != null) {
/* 42 */                for (String str : concurrentHashMap.keySet()) {
/* 52 */                    AbstractC0298j.m1863d(this.f11230a, str, c1505c, str, iLogger);
                        }
                    }
/* 56 */            c1505c.m5288l();
                }
            }
