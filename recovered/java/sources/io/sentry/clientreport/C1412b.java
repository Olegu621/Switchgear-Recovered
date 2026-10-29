            package io.sentry.clientreport;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.clientreport.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1412b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final Date f10835a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f10836b;

                /* JADX INFO: renamed from: c */
                public HashMap f10837c;

                public C1412b(Date date, ArrayList arrayList) {
/* 4 */             this.f10835a = date;
/* 6 */             this.f10836b = arrayList;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("timestamp");
/* 21 */            c1505c.m5300y(AbstractC1417a.m5178q(this.f10835a.getTime()));
/* 26 */            c1505c.m5291p("discarded_events");
/* 31 */            c1505c.m5297v(iLogger, this.f10836b);
/* 34 */            HashMap map = this.f10837c;
/* 36 */            if (map != null) {
/* 50 */                for (String str : map.keySet()) {
/* 60 */                    AbstractC0298j.m1862c(this.f10837c, str, c1505c, str, iLogger);
                        }
                    }
/* 64 */            c1505c.m5288l();
                }
            }
