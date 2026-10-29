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
            
            /* JADX INFO: renamed from: io.sentry.protocol.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1613m implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public ConcurrentHashMap f11395U;

                /* JADX INFO: renamed from: a */
                public String f11396a;

                /* JADX INFO: renamed from: b */
                public Integer f11397b;

                /* JADX INFO: renamed from: c */
                public String f11398c;

                /* JADX INFO: renamed from: d */
                public String f11399d;

                /* JADX INFO: renamed from: e */
                public Integer f11400e;

                /* JADX INFO: renamed from: f */
                public String f11401f;

                /* JADX INFO: renamed from: i */
                public Boolean f11402i;

                /* JADX INFO: renamed from: v */
                public String f11403v;

                /* JADX INFO: renamed from: w */
                public String f11404w;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1613m.class == obj.getClass()) {
/* 17 */                C1613m c1613m = (C1613m) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11396a, c1613m.f11396a) && AbstractC1704c.m5453h(this.f11397b, c1613m.f11397b) && AbstractC1704c.m5453h(this.f11398c, c1613m.f11398c) && AbstractC1704c.m5453h(this.f11399d, c1613m.f11399d) && AbstractC1704c.m5453h(this.f11400e, c1613m.f11400e) && AbstractC1704c.m5453h(this.f11401f, c1613m.f11401f) && AbstractC1704c.m5453h(this.f11402i, c1613m.f11402i) && AbstractC1704c.m5453h(this.f11403v, c1613m.f11403v) && AbstractC1704c.m5453h(this.f11404w, c1613m.f11404w)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{this.f11396a, this.f11397b, this.f11398c, this.f11399d, this.f11400e, this.f11401f, this.f11402i, this.f11403v, this.f11404w});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11396a != null) {
/* 12 */                c1505c.m5291p("name");
/* 17 */                c1505c.m5300y(this.f11396a);
                    }
/* 22 */            if (this.f11397b != null) {
/* 26 */                c1505c.m5291p("id");
/* 31 */                c1505c.m5299x(this.f11397b);
                    }
/* 36 */            if (this.f11398c != null) {
/* 40 */                c1505c.m5291p("vendor_id");
/* 45 */                c1505c.m5300y(this.f11398c);
                    }
/* 50 */            if (this.f11399d != null) {
/* 54 */                c1505c.m5291p("vendor_name");
/* 59 */                c1505c.m5300y(this.f11399d);
                    }
/* 64 */            if (this.f11400e != null) {
/* 68 */                c1505c.m5291p("memory_size");
/* 73 */                c1505c.m5299x(this.f11400e);
                    }
/* 78 */            if (this.f11401f != null) {
/* 82 */                c1505c.m5291p("api_type");
/* 87 */                c1505c.m5300y(this.f11401f);
                    }
/* 92 */            if (this.f11402i != null) {
/* 96 */                c1505c.m5291p("multi_threaded_rendering");
/* 101 */               c1505c.m5298w(this.f11402i);
                    }
/* 106 */           if (this.f11403v != null) {
/* 110 */               c1505c.m5291p("version");
/* 115 */               c1505c.m5300y(this.f11403v);
                    }
/* 120 */           if (this.f11404w != null) {
/* 124 */               c1505c.m5291p("npot_support");
/* 129 */               c1505c.m5300y(this.f11404w);
                    }
/* 132 */           ConcurrentHashMap concurrentHashMap = this.f11395U;
/* 134 */           if (concurrentHashMap != null) {
/* 148 */               for (String str : concurrentHashMap.keySet()) {
/* 158 */                   AbstractC0298j.m1863d(this.f11395U, str, c1505c, str, iLogger);
                        }
                    }
/* 162 */           c1505c.m5288l();
                }
            }
