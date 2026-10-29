            package io.sentry.rrweb;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1656k extends AbstractC1647b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: c */
                public String f11612c;

                /* JADX INFO: renamed from: d */
                public HashMap f11613d;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("type");
/* 13 */            c1505c.m5297v(iLogger, this.f11588a);
/* 18 */            c1505c.m5291p("timestamp");
/* 23 */            c1505c.m5296u(this.f11589b);
/* 28 */            c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 31 */            c1505c.m5287i();
/* 36 */            c1505c.m5291p("tag");
/* 41 */            c1505c.m5300y(this.f11612c);
/* 46 */            c1505c.m5291p("payload");
/* 49 */            c1505c.m5287i();
/* 52 */            HashMap map = this.f11613d;
/* 54 */            if (map != null) {
/* 68 */                for (String str : map.keySet()) {
/* 76 */                    Object obj = map.get(str);
/* 80 */                    c1505c.m5291p(str);
/* 83 */                    c1505c.m5297v(iLogger, obj);
                        }
                    }
/* 87 */            c1505c.m5288l();
/* 90 */            c1505c.m5288l();
/* 93 */            c1505c.m5288l();
                }
            }
