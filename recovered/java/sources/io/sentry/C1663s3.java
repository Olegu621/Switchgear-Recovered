            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.s3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1663s3 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11641a;

                /* JADX INFO: renamed from: b */
                public String f11642b;

                /* JADX INFO: renamed from: c */
                public String f11643c;

                /* JADX INFO: renamed from: d */
                public Long f11644d;

                /* JADX INFO: renamed from: e */
                public Long f11645e;

                /* JADX INFO: renamed from: f */
                public Long f11646f;

                /* JADX INFO: renamed from: i */
                public Long f11647i;

                /* JADX INFO: renamed from: v */
                public ConcurrentHashMap f11648v;

                public C1663s3(InterfaceC1549m1 interfaceC1549m1, Long l, Long l2) {
/* 12 */            this.f11641a = interfaceC1549m1.mo5247g().m5380a();
/* 24 */            this.f11642b = interfaceC1549m1.mo4737s().f10755a.m5380a();
/* 43 */            this.f11643c = interfaceC1549m1.getName().isEmpty() ? "unknown" : interfaceC1549m1.getName();
/* 45 */            this.f11644d = l;
/* 47 */            this.f11646f = l2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 97 */                return true;
                    }
/* 4 */             if (obj == null || C1663s3.class != obj.getClass()) {
/* 99 */                return false;
                    }
/* 15 */            C1663s3 c1663s3 = (C1663s3) obj;
                    return this.f11641a.equals(c1663s3.f11641a) && this.f11642b.equals(c1663s3.f11642b) && this.f11643c.equals(c1663s3.f11643c) && this.f11644d.equals(c1663s3.f11644d) && this.f11646f.equals(c1663s3.f11646f) && AbstractC1704c.m5453h(this.f11647i, c1663s3.f11647i) && AbstractC1704c.m5453h(this.f11645e, c1663s3.f11645e) && AbstractC1704c.m5453h(this.f11648v, c1663s3.f11648v);
                }

                public final int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{this.f11641a, this.f11642b, this.f11643c, this.f11644d, this.f11645e, this.f11646f, this.f11647i, this.f11648v});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("id");
/* 13 */            c1505c.m5297v(iLogger, this.f11641a);
/* 18 */            c1505c.m5291p("trace_id");
/* 23 */            c1505c.m5297v(iLogger, this.f11642b);
/* 28 */            c1505c.m5291p("name");
/* 33 */            c1505c.m5297v(iLogger, this.f11643c);
/* 38 */            c1505c.m5291p("relative_start_ns");
/* 43 */            c1505c.m5297v(iLogger, this.f11644d);
/* 48 */            c1505c.m5291p("relative_end_ns");
/* 53 */            c1505c.m5297v(iLogger, this.f11645e);
/* 58 */            c1505c.m5291p("relative_cpu_start_ms");
/* 63 */            c1505c.m5297v(iLogger, this.f11646f);
/* 68 */            c1505c.m5291p("relative_cpu_end_ms");
/* 73 */            c1505c.m5297v(iLogger, this.f11647i);
/* 76 */            ConcurrentHashMap concurrentHashMap = this.f11648v;
/* 78 */            if (concurrentHashMap != null) {
/* 92 */                for (String str : concurrentHashMap.keySet()) {
/* 102 */                   AbstractC0298j.m1863d(this.f11648v, str, c1505c, str, iLogger);
                        }
                    }
/* 106 */           c1505c.m5288l();
                }
            }
