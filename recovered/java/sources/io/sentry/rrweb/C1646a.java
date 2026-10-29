            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.math.BigDecimal;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1646a extends AbstractC1647b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public HashMap f11578U;

                /* JADX INFO: renamed from: V */
                public ConcurrentHashMap f11579V;

                /* JADX INFO: renamed from: W */
                public ConcurrentHashMap f11580W;

                /* JADX INFO: renamed from: c */
                public String f11581c;

                /* JADX INFO: renamed from: d */
                public double f11582d;

                /* JADX INFO: renamed from: e */
                public String f11583e;

                /* JADX INFO: renamed from: f */
                public String f11584f;

                /* JADX INFO: renamed from: i */
                public String f11585i;

                /* JADX INFO: renamed from: v */
                public EnumC1553m5 f11586v;

                /* JADX INFO: renamed from: w */
                public ConcurrentHashMap f11587w;

                public C1646a() {
/* 3 */             super(EnumC1648c.Custom);
/* 8 */             this.f11581c = "breadcrumb";
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
/* 41 */            c1505c.m5300y(this.f11581c);
/* 46 */            c1505c.m5291p("payload");
/* 49 */            c1505c.m5287i();
/* 54 */            if (this.f11583e != null) {
/* 56 */                c1505c.m5291p("type");
/* 61 */                c1505c.m5300y(this.f11583e);
                    }
/* 64 */            c1505c.m5291p("timestamp");
/* 73 */            c1505c.m5297v(iLogger, BigDecimal.valueOf(this.f11582d));
/* 78 */            if (this.f11584f != null) {
/* 82 */                c1505c.m5291p("category");
/* 87 */                c1505c.m5300y(this.f11584f);
                    }
/* 92 */            if (this.f11585i != null) {
/* 96 */                c1505c.m5291p("message");
/* 101 */               c1505c.m5300y(this.f11585i);
                    }
/* 106 */           if (this.f11586v != null) {
/* 110 */               c1505c.m5291p(FirebaseAnalytics.Param.LEVEL);
/* 115 */               c1505c.m5297v(iLogger, this.f11586v);
                    }
/* 120 */           if (this.f11587w != null) {
/* 122 */               c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 127 */               c1505c.m5297v(iLogger, this.f11587w);
                    }
/* 130 */           ConcurrentHashMap concurrentHashMap = this.f11579V;
/* 132 */           if (concurrentHashMap != null) {
/* 146 */               for (String str : concurrentHashMap.keySet()) {
/* 156 */                   AbstractC0298j.m1863d(this.f11579V, str, c1505c, str, iLogger);
                        }
                    }
/* 160 */           c1505c.m5288l();
/* 163 */           ConcurrentHashMap concurrentHashMap2 = this.f11580W;
/* 165 */           if (concurrentHashMap2 != null) {
/* 179 */               for (String str2 : concurrentHashMap2.keySet()) {
/* 189 */                   AbstractC0298j.m1863d(this.f11580W, str2, c1505c, str2, iLogger);
                        }
                    }
/* 193 */           c1505c.m5288l();
/* 196 */           HashMap map = this.f11578U;
/* 198 */           if (map != null) {
/* 212 */               for (String str3 : map.keySet()) {
/* 222 */                   AbstractC0298j.m1862c(this.f11578U, str3, c1505c, str3, iLogger);
                        }
                    }
/* 226 */           c1505c.m5288l();
                }
            }
