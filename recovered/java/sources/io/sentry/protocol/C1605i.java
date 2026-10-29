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
            
            /* JADX INFO: renamed from: io.sentry.protocol.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1605i implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final String f11356a;

                /* JADX INFO: renamed from: b */
                public final boolean f11357b;

                /* JADX INFO: renamed from: c */
                public ConcurrentHashMap f11358c;

                public C1605i(String str, boolean z) {
/* 4 */             this.f11356a = str;
/* 6 */             this.f11357b = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1605i.class == obj.getClass()) {
/* 17 */                C1605i c1605i = (C1605i) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11356a, c1605i.f11356a) && AbstractC1704c.m5453h(Boolean.valueOf(this.f11357b), Boolean.valueOf(c1605i.f11357b))) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f11356a, Boolean.valueOf(this.f11357b)});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("flag");
/* 13 */            c1505c.m5300y(this.f11356a);
/* 18 */            c1505c.m5291p("result");
/* 23 */            c1505c.m5301z(this.f11357b);
/* 26 */            ConcurrentHashMap concurrentHashMap = this.f11358c;
/* 28 */            if (concurrentHashMap != null) {
/* 42 */                for (String str : concurrentHashMap.keySet()) {
/* 52 */                    AbstractC0298j.m1863d(this.f11358c, str, c1505c, str, iLogger);
                        }
                    }
/* 56 */            c1505c.m5288l();
                }
            }
