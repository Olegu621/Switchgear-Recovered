            package io.sentry.profilemeasurements;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.profilemeasurements.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1586b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public ConcurrentHashMap f11233a;

                /* JADX INFO: renamed from: b */
                public double f11234b;

                /* JADX INFO: renamed from: c */
                public String f11235c;

                /* JADX INFO: renamed from: d */
                public double f11236d;

                public C1586b(Long l, Number number, long j) {
/* 8 */             this.f11235c = l.toString();
/* 14 */            this.f11236d = number.doubleValue();
/* 23 */            this.f11234b = j / 1.0E9d;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 53 */                return true;
                    }
/* 4 */             if (obj == null || C1586b.class != obj.getClass()) {
/* 55 */                return false;
                    }
/* 15 */            C1586b c1586b = (C1586b) obj;
                    return AbstractC1704c.m5453h(this.f11233a, c1586b.f11233a) && this.f11235c.equals(c1586b.f11235c) && this.f11236d == c1586b.f11236d && this.f11234b == c1586b.f11234b;
                }

                public final int hashCode() {
/* 15 */            return Arrays.hashCode(new Object[]{this.f11233a, this.f11235c, Double.valueOf(this.f11236d)});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p(FirebaseAnalytics.Param.VALUE);
/* 17 */            c1505c.m5297v(iLogger, Double.valueOf(this.f11236d));
/* 22 */            c1505c.m5291p("elapsed_since_start_ns");
/* 27 */            c1505c.m5297v(iLogger, this.f11235c);
/* 32 */            c1505c.m5291p("timestamp");
/* 41 */            c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11234b));
/* 44 */            ConcurrentHashMap concurrentHashMap = this.f11233a;
/* 46 */            if (concurrentHashMap != null) {
/* 60 */                for (String str : concurrentHashMap.keySet()) {
/* 70 */                    AbstractC0298j.m1863d(this.f11233a, str, c1505c, str, iLogger);
                        }
                    }
/* 74 */            c1505c.m5288l();
                }
            }
