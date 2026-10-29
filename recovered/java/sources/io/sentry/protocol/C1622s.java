            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1622s implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11455a;

                /* JADX INFO: renamed from: b */
                public ConcurrentHashMap f11456b;

                /* JADX INFO: renamed from: c */
                public Integer f11457c;

                /* JADX INFO: renamed from: d */
                public Long f11458d;

                /* JADX INFO: renamed from: e */
                public Object f11459e;

                /* JADX INFO: renamed from: f */
                public ConcurrentHashMap f11460f;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11455a != null) {
/* 12 */                c1505c.m5291p("cookies");
/* 17 */                c1505c.m5300y(this.f11455a);
                    }
/* 22 */            if (this.f11456b != null) {
/* 26 */                c1505c.m5291p("headers");
/* 31 */                c1505c.m5297v(iLogger, this.f11456b);
                    }
/* 36 */            if (this.f11457c != null) {
/* 40 */                c1505c.m5291p("status_code");
/* 45 */                c1505c.m5297v(iLogger, this.f11457c);
                    }
/* 50 */            if (this.f11458d != null) {
/* 54 */                c1505c.m5291p("body_size");
/* 59 */                c1505c.m5297v(iLogger, this.f11458d);
                    }
/* 64 */            if (this.f11459e != null) {
/* 68 */                c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 73 */                c1505c.m5297v(iLogger, this.f11459e);
                    }
/* 76 */            ConcurrentHashMap concurrentHashMap = this.f11460f;
/* 78 */            if (concurrentHashMap != null) {
/* 92 */                for (String str : concurrentHashMap.keySet()) {
/* 102 */                   AbstractC0298j.m1863d(this.f11460f, str, c1505c, str, iLogger);
                        }
                    }
/* 106 */           c1505c.m5288l();
                }
            }
