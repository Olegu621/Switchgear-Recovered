            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1653h implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public int f11599a;

                /* JADX INFO: renamed from: b */
                public float f11600b;

                /* JADX INFO: renamed from: c */
                public float f11601c;

                /* JADX INFO: renamed from: d */
                public long f11602d;

                /* JADX INFO: renamed from: e */
                public HashMap f11603e;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("id");
/* 14 */            c1505c.m5296u(this.f11599a);
/* 19 */            c1505c.m5291p("x");
/* 25 */            c1505c.m5295t(this.f11600b);
/* 30 */            c1505c.m5291p("y");
/* 36 */            c1505c.m5295t(this.f11601c);
/* 41 */            c1505c.m5291p("timeOffset");
/* 46 */            c1505c.m5296u(this.f11602d);
/* 49 */            HashMap map = this.f11603e;
/* 51 */            if (map != null) {
/* 65 */                for (String str : map.keySet()) {
/* 75 */                    AbstractC0298j.m1862c(this.f11603e, str, c1505c, str, iLogger);
                        }
                    }
/* 79 */            c1505c.m5288l();
                }
            }
