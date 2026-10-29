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
            
            /* JADX INFO: renamed from: io.sentry.protocol.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1620q implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11436a;

                /* JADX INFO: renamed from: b */
                public String f11437b;

                /* JADX INFO: renamed from: c */
                public String f11438c;

                /* JADX INFO: renamed from: d */
                public String f11439d;

                /* JADX INFO: renamed from: e */
                public String f11440e;

                /* JADX INFO: renamed from: f */
                public Boolean f11441f;

                /* JADX INFO: renamed from: i */
                public ConcurrentHashMap f11442i;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1620q.class == obj.getClass()) {
/* 17 */                C1620q c1620q = (C1620q) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11436a, c1620q.f11436a) && AbstractC1704c.m5453h(this.f11437b, c1620q.f11437b) && AbstractC1704c.m5453h(this.f11438c, c1620q.f11438c) && AbstractC1704c.m5453h(this.f11439d, c1620q.f11439d) && AbstractC1704c.m5453h(this.f11440e, c1620q.f11440e) && AbstractC1704c.m5453h(this.f11441f, c1620q.f11441f)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{this.f11436a, this.f11437b, this.f11438c, this.f11439d, this.f11440e, this.f11441f});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11436a != null) {
/* 12 */                c1505c.m5291p("name");
/* 17 */                c1505c.m5300y(this.f11436a);
                    }
/* 22 */            if (this.f11437b != null) {
/* 26 */                c1505c.m5291p("version");
/* 31 */                c1505c.m5300y(this.f11437b);
                    }
/* 36 */            if (this.f11438c != null) {
/* 40 */                c1505c.m5291p("raw_description");
/* 45 */                c1505c.m5300y(this.f11438c);
                    }
/* 50 */            if (this.f11439d != null) {
/* 54 */                c1505c.m5291p("build");
/* 59 */                c1505c.m5300y(this.f11439d);
                    }
/* 64 */            if (this.f11440e != null) {
/* 68 */                c1505c.m5291p("kernel_version");
/* 73 */                c1505c.m5300y(this.f11440e);
                    }
/* 78 */            if (this.f11441f != null) {
/* 82 */                c1505c.m5291p("rooted");
/* 87 */                c1505c.m5298w(this.f11441f);
                    }
/* 90 */            ConcurrentHashMap concurrentHashMap = this.f11442i;
/* 92 */            if (concurrentHashMap != null) {
/* 106 */               for (String str : concurrentHashMap.keySet()) {
/* 116 */                   AbstractC0298j.m1863d(this.f11442i, str, c1505c, str, iLogger);
                        }
                    }
/* 120 */           c1505c.m5288l();
                }
            }
