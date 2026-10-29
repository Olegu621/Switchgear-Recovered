            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1654i extends AbstractC1650e implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: d */
                public int f11604d;

                /* JADX INFO: renamed from: e */
                public List f11605e;

                /* JADX INFO: renamed from: f */
                public HashMap f11606f;

                /* JADX INFO: renamed from: i */
                public HashMap f11607i;

                public C1654i() {
/* 3 */             super(EnumC1649d.TouchMove);
                }

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
/* 36 */            c1505c.m5291p(FirebaseAnalytics.Param.SOURCE);
/* 41 */            c1505c.m5297v(iLogger, this.f11590c);
/* 44 */            List list = this.f11605e;
/* 46 */            if (list != null && !list.isEmpty()) {
/* 56 */                c1505c.m5291p("positions");
/* 61 */                c1505c.m5297v(iLogger, this.f11605e);
                    }
/* 66 */            c1505c.m5291p("pointerId");
/* 72 */            c1505c.m5296u(this.f11604d);
/* 75 */            HashMap map = this.f11607i;
/* 77 */            if (map != null) {
/* 91 */                for (String str : map.keySet()) {
/* 101 */                   AbstractC0298j.m1862c(this.f11607i, str, c1505c, str, iLogger);
                        }
                    }
/* 105 */           c1505c.m5288l();
/* 108 */           HashMap map2 = this.f11606f;
/* 110 */           if (map2 != null) {
/* 124 */               for (String str2 : map2.keySet()) {
/* 134 */                   AbstractC0298j.m1862c(this.f11606f, str2, c1505c, str2, iLogger);
                        }
                    }
/* 138 */           c1505c.m5288l();
                }
            }
