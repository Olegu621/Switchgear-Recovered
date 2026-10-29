            package io.sentry.clientreport;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.clientreport.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1415e implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final String f10840a;

                /* JADX INFO: renamed from: b */
                public final String f10841b;

                /* JADX INFO: renamed from: c */
                public final Long f10842c;

                /* JADX INFO: renamed from: d */
                public HashMap f10843d;

                public C1415e(String str, String str2, Long l) {
/* 4 */             this.f10840a = str;
/* 6 */             this.f10841b = str2;
/* 8 */             this.f10842c = l;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("reason");
/* 13 */            c1505c.m5300y(this.f10840a);
/* 18 */            c1505c.m5291p("category");
/* 23 */            c1505c.m5300y(this.f10841b);
/* 28 */            c1505c.m5291p(FirebaseAnalytics.Param.QUANTITY);
/* 33 */            c1505c.m5299x(this.f10842c);
/* 36 */            HashMap map = this.f10843d;
/* 38 */            if (map != null) {
/* 52 */                for (String str : map.keySet()) {
/* 62 */                    AbstractC0298j.m1862c(this.f10843d, str, c1505c, str, iLogger);
                        }
                    }
/* 66 */            c1505c.m5288l();
                }

                public final String toString() {
/* 38 */            return "DiscardedEvent{reason='" + this.f10840a + "', category='" + this.f10841b + "', quantity=" + this.f10842c + '}';
                }
            }
