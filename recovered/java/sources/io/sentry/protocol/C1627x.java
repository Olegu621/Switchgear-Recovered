            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: io.sentry.protocol.x */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1627x implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final String f11480a;

                /* JADX INFO: renamed from: b */
                public final String f11481b;

                /* JADX INFO: renamed from: c */
                public HashMap f11482c;

                public C1627x(String str, String str2) {
/* 4 */             this.f11480a = str;
/* 6 */             this.f11481b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1627x.class == obj.getClass()) {
/* 17 */                C1627x c1627x = (C1627x) obj;
/* 27 */                if (Objects.equals(this.f11480a, c1627x.f11480a) && Objects.equals(this.f11481b, c1627x.f11481b)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.f11480a, this.f11481b);
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("name");
/* 13 */            c1505c.m5300y(this.f11480a);
/* 18 */            c1505c.m5291p("version");
/* 23 */            c1505c.m5300y(this.f11481b);
/* 26 */            HashMap map = this.f11482c;
/* 28 */            if (map != null) {
/* 42 */                for (String str : map.keySet()) {
/* 52 */                    AbstractC0298j.m1862c(this.f11482c, str, c1505c, str, iLogger);
                        }
                    }
/* 56 */            c1505c.m5288l();
                }
            }
