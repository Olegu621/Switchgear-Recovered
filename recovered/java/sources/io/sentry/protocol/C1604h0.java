            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.h0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1604h0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final String f11354a;

                /* JADX INFO: renamed from: b */
                public ConcurrentHashMap f11355b;

                public C1604h0(String str) {
/* 4 */             this.f11354a = str;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 6 */             String str = this.f11354a;
/* 8 */             if (str != null) {
/* 12 */                c1505c.m5291p(FirebaseAnalytics.Param.SOURCE);
/* 15 */                c1505c.m5297v(iLogger, str);
                    }
/* 18 */            ConcurrentHashMap concurrentHashMap = this.f11355b;
/* 20 */            if (concurrentHashMap != null) {
/* 34 */                for (String str2 : concurrentHashMap.keySet()) {
/* 44 */                    AbstractC0298j.m1863d(this.f11355b, str2, c1505c, str2, iLogger);
                        }
                    }
/* 48 */            c1505c.m5288l();
                }
            }
