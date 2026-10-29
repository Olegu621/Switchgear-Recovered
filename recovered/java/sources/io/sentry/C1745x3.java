            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.vendor.gson.stream.C1732c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.x3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1745x3 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public Integer f11809a;

                /* JADX INFO: renamed from: b */
                public List f11810b;

                /* JADX INFO: renamed from: c */
                public HashMap f11811c;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1745x3.class == obj.getClass()) {
/* 17 */                C1745x3 c1745x3 = (C1745x3) obj;
/* 27 */                if (AbstractC1704c.m5453h(this.f11809a, c1745x3.f11809a) && AbstractC1704c.m5453h(this.f11810b, c1745x3.f11810b)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f11809a, this.f11810b});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             C1732c c1732c = (C1732c) c1505c.f11042b;
/* 12 */            if (this.f11809a != null) {
/* 16 */                c1505c.m5291p("segment_id");
/* 21 */                c1505c.m5299x(this.f11809a);
                    }
/* 24 */            HashMap map = this.f11811c;
/* 26 */            if (map != null) {
/* 40 */                for (String str : map.keySet()) {
/* 50 */                    AbstractC0298j.m1862c(this.f11811c, str, c1505c, str, iLogger);
                        }
                    }
/* 54 */            c1505c.m5288l();
/* 58 */            c1732c.f11789f = true;
/* 62 */            if (this.f11809a != null) {
/* 64 */                c1732c.m5517l();
/* 67 */                c1732c.m5511c();
/* 74 */                c1732c.f11784a.append((CharSequence) "\n");
                    }
/* 77 */            List list = this.f11810b;
/* 79 */            if (list != null) {
/* 81 */                c1505c.m5297v(iLogger, list);
                    }
/* 85 */            c1732c.f11789f = false;
                }
            }
