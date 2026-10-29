            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.protocol.k0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1610k0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final String f11376a;

                /* JADX INFO: renamed from: b */
                public final List f11377b;

                /* JADX INFO: renamed from: c */
                public HashMap f11378c;

                public C1610k0(String str, List list) {
/* 4 */             this.f11376a = str;
/* 6 */             this.f11377b = list;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 6 */             String str = this.f11376a;
/* 8 */             if (str != null) {
/* 12 */                c1505c.m5291p("rendering_system");
/* 15 */                c1505c.m5300y(str);
                    }
/* 18 */            List list = this.f11377b;
/* 20 */            if (list != null) {
/* 24 */                c1505c.m5291p("windows");
/* 27 */                c1505c.m5297v(iLogger, list);
                    }
/* 30 */            HashMap map = this.f11378c;
/* 32 */            if (map != null) {
/* 46 */                for (String str2 : map.keySet()) {
/* 56 */                    AbstractC0298j.m1862c(this.f11378c, str2, c1505c, str2, iLogger);
                        }
                    }
/* 60 */            c1505c.m5288l();
                }
            }
