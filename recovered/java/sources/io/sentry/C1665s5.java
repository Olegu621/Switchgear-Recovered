            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: io.sentry.s5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1665s5 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public C1626w f11652a;

                /* JADX INFO: renamed from: b */
                public C1430d7 f11653b;

                /* JADX INFO: renamed from: c */
                public Double f11654c;

                /* JADX INFO: renamed from: d */
                public String f11655d;

                /* JADX INFO: renamed from: e */
                public String f11656e;

                /* JADX INFO: renamed from: f */
                public String f11657f;

                /* JADX INFO: renamed from: i */
                public Double f11658i;

                /* JADX INFO: renamed from: v */
                public Map f11659v;

                /* JADX INFO: renamed from: w */
                public HashMap f11660w;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("timestamp");
/* 21 */            c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11654c.doubleValue()));
/* 26 */            c1505c.m5291p("type");
/* 31 */            c1505c.m5300y(this.f11657f);
/* 36 */            c1505c.m5291p("name");
/* 41 */            c1505c.m5300y(this.f11655d);
/* 46 */            c1505c.m5291p(FirebaseAnalytics.Param.VALUE);
/* 51 */            c1505c.m5299x(this.f11658i);
/* 56 */            c1505c.m5291p("trace_id");
/* 61 */            c1505c.m5297v(iLogger, this.f11652a);
/* 66 */            if (this.f11653b != null) {
/* 70 */                c1505c.m5291p("span_id");
/* 75 */                c1505c.m5297v(iLogger, this.f11653b);
                    }
/* 80 */            if (this.f11656e != null) {
/* 84 */                c1505c.m5291p("unit");
/* 89 */                c1505c.m5297v(iLogger, this.f11656e);
                    }
/* 94 */            if (this.f11659v != null) {
/* 98 */                c1505c.m5291p("attributes");
/* 103 */               c1505c.m5297v(iLogger, this.f11659v);
                    }
/* 106 */           HashMap map = this.f11660w;
/* 108 */           if (map != null) {
/* 122 */               for (String str : map.keySet()) {
/* 132 */                   AbstractC0298j.m1862c(this.f11660w, str, c1505c, str, iLogger);
                        }
                    }
/* 136 */           c1505c.m5288l();
                }
            }
