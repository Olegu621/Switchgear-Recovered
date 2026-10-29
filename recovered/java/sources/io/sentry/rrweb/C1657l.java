            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.math.BigDecimal;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1657l extends AbstractC1647b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public ConcurrentHashMap f11614U;

                /* JADX INFO: renamed from: V */
                public ConcurrentHashMap f11615V;

                /* JADX INFO: renamed from: c */
                public String f11616c;

                /* JADX INFO: renamed from: d */
                public String f11617d;

                /* JADX INFO: renamed from: e */
                public String f11618e;

                /* JADX INFO: renamed from: f */
                public double f11619f;

                /* JADX INFO: renamed from: i */
                public double f11620i;

                /* JADX INFO: renamed from: v */
                public ConcurrentHashMap f11621v;

                /* JADX INFO: renamed from: w */
                public HashMap f11622w;

                public C1657l() {
/* 3 */             super(EnumC1648c.Custom);
/* 8 */             this.f11616c = "performanceSpan";
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
/* 36 */            c1505c.m5291p("tag");
/* 41 */            c1505c.m5300y(this.f11616c);
/* 46 */            c1505c.m5291p("payload");
/* 49 */            c1505c.m5287i();
/* 54 */            if (this.f11617d != null) {
/* 58 */                c1505c.m5291p("op");
/* 63 */                c1505c.m5300y(this.f11617d);
                    }
/* 68 */            if (this.f11618e != null) {
/* 72 */                c1505c.m5291p("description");
/* 77 */                c1505c.m5300y(this.f11618e);
                    }
/* 82 */            c1505c.m5291p("startTimestamp");
/* 91 */            c1505c.m5297v(iLogger, BigDecimal.valueOf(this.f11619f));
/* 96 */            c1505c.m5291p("endTimestamp");
/* 105 */           c1505c.m5297v(iLogger, BigDecimal.valueOf(this.f11620i));
/* 110 */           if (this.f11621v != null) {
/* 112 */               c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 117 */               c1505c.m5297v(iLogger, this.f11621v);
                    }
/* 120 */           ConcurrentHashMap concurrentHashMap = this.f11614U;
/* 122 */           if (concurrentHashMap != null) {
/* 136 */               for (String str : concurrentHashMap.keySet()) {
/* 146 */                   AbstractC0298j.m1863d(this.f11614U, str, c1505c, str, iLogger);
                        }
                    }
/* 150 */           c1505c.m5288l();
/* 153 */           ConcurrentHashMap concurrentHashMap2 = this.f11615V;
/* 155 */           if (concurrentHashMap2 != null) {
/* 169 */               for (String str2 : concurrentHashMap2.keySet()) {
/* 179 */                   AbstractC0298j.m1863d(this.f11615V, str2, c1505c, str2, iLogger);
                        }
                    }
/* 183 */           c1505c.m5288l();
/* 186 */           HashMap map = this.f11622w;
/* 188 */           if (map != null) {
/* 202 */               for (String str3 : map.keySet()) {
/* 212 */                   AbstractC0298j.m1862c(this.f11622w, str3, c1505c, str3, iLogger);
                        }
                    }
/* 216 */           c1505c.m5288l();
                }
            }
