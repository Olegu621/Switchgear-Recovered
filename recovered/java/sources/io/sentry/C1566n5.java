            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.n5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1566n5 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public int f11177a;

                /* JADX INFO: renamed from: b */
                public String f11178b;

                /* JADX INFO: renamed from: c */
                public String f11179c;

                /* JADX INFO: renamed from: d */
                public String f11180d;

                /* JADX INFO: renamed from: e */
                public Long f11181e;

                /* JADX INFO: renamed from: f */
                public ConcurrentHashMap f11182f;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || C1566n5.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return AbstractC1704c.m5453h(this.f11178b, ((C1566n5) obj).f11178b);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f11178b});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("type");
/* 14 */            c1505c.m5296u(this.f11177a);
/* 19 */            if (this.f11178b != null) {
/* 23 */                c1505c.m5291p("address");
/* 28 */                c1505c.m5300y(this.f11178b);
                    }
/* 33 */            if (this.f11179c != null) {
/* 37 */                c1505c.m5291p("package_name");
/* 42 */                c1505c.m5300y(this.f11179c);
                    }
/* 47 */            if (this.f11180d != null) {
/* 51 */                c1505c.m5291p("class_name");
/* 56 */                c1505c.m5300y(this.f11180d);
                    }
/* 61 */            if (this.f11181e != null) {
/* 65 */                c1505c.m5291p("thread_id");
/* 70 */                c1505c.m5299x(this.f11181e);
                    }
/* 73 */            ConcurrentHashMap concurrentHashMap = this.f11182f;
/* 75 */            if (concurrentHashMap != null) {
/* 89 */                for (String str : concurrentHashMap.keySet()) {
/* 99 */                    AbstractC0298j.m1863d(this.f11182f, str, c1505c, str, iLogger);
                        }
                    }
/* 103 */           c1505c.m5288l();
                }
            }
