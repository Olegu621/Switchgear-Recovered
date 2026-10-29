            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.v */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1625v implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11471a;

                /* JADX INFO: renamed from: b */
                public String f11472b;

                /* JADX INFO: renamed from: c */
                public String f11473c;

                /* JADX INFO: renamed from: d */
                public Long f11474d;

                /* JADX INFO: renamed from: e */
                public C1594c0 f11475e;

                /* JADX INFO: renamed from: f */
                public C1615o f11476f;

                /* JADX INFO: renamed from: i */
                public HashMap f11477i;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11471a != null) {
/* 12 */                c1505c.m5291p("type");
/* 17 */                c1505c.m5300y(this.f11471a);
                    }
/* 22 */            if (this.f11472b != null) {
/* 26 */                c1505c.m5291p(FirebaseAnalytics.Param.VALUE);
/* 31 */                c1505c.m5300y(this.f11472b);
                    }
/* 36 */            if (this.f11473c != null) {
/* 40 */                c1505c.m5291p("module");
/* 45 */                c1505c.m5300y(this.f11473c);
                    }
/* 50 */            if (this.f11474d != null) {
/* 54 */                c1505c.m5291p("thread_id");
/* 59 */                c1505c.m5299x(this.f11474d);
                    }
/* 64 */            if (this.f11475e != null) {
/* 68 */                c1505c.m5291p("stacktrace");
/* 73 */                c1505c.m5297v(iLogger, this.f11475e);
                    }
/* 78 */            if (this.f11476f != null) {
/* 82 */                c1505c.m5291p("mechanism");
/* 87 */                c1505c.m5297v(iLogger, this.f11476f);
                    }
/* 90 */            HashMap map = this.f11477i;
/* 92 */            if (map != null) {
/* 106 */               for (String str : map.keySet()) {
/* 116 */                   AbstractC0298j.m1862c(this.f11477i, str, c1505c, str, iLogger);
                        }
                    }
/* 120 */           c1505c.m5288l();
                }
            }
