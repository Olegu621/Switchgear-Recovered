            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1623t implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11461a;

                /* JADX INFO: renamed from: b */
                public Integer f11462b;

                /* JADX INFO: renamed from: c */
                public Integer f11463c;

                /* JADX INFO: renamed from: d */
                public Integer f11464d;

                /* JADX INFO: renamed from: e */
                public HashMap f11465e;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11461a != null) {
/* 12 */                c1505c.m5291p("sdk_name");
/* 17 */                c1505c.m5300y(this.f11461a);
                    }
/* 22 */            if (this.f11462b != null) {
/* 26 */                c1505c.m5291p("version_major");
/* 31 */                c1505c.m5299x(this.f11462b);
                    }
/* 36 */            if (this.f11463c != null) {
/* 40 */                c1505c.m5291p("version_minor");
/* 45 */                c1505c.m5299x(this.f11463c);
                    }
/* 50 */            if (this.f11464d != null) {
/* 54 */                c1505c.m5291p("version_patchlevel");
/* 59 */                c1505c.m5299x(this.f11464d);
                    }
/* 62 */            HashMap map = this.f11465e;
/* 64 */            if (map != null) {
/* 78 */                for (String str : map.keySet()) {
/* 88 */                    AbstractC0298j.m1862c(this.f11465e, str, c1505c, str, iLogger);
                        }
                    }
/* 92 */            c1505c.m5288l();
                }
            }
