            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: io.sentry.o5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1575o5 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final C1626w f11201a;

                /* JADX INFO: renamed from: b */
                public C1430d7 f11202b;

                /* JADX INFO: renamed from: c */
                public final Double f11203c;

                /* JADX INFO: renamed from: d */
                public final String f11204d;

                /* JADX INFO: renamed from: e */
                public final EnumC1636q5 f11205e;

                /* JADX INFO: renamed from: f */
                public Integer f11206f;

                /* JADX INFO: renamed from: i */
                public Map f11207i;

                /* JADX INFO: renamed from: v */
                public HashMap f11208v;

                public C1575o5(C1626w c1626w, Double d, String str, EnumC1636q5 enumC1636q5) {
/* 4 */             this.f11201a = c1626w;
/* 6 */             this.f11203c = d;
/* 8 */             this.f11204d = str;
/* 10 */            this.f11205e = enumC1636q5;
                }

                /* JADX INFO: renamed from: a */
                public final void m5369a(String str, C1614n c1614n) {
/* 3 */             if (this.f11207i == null) {
/* 10 */                this.f11207i = new HashMap();
                    }
/* 14 */            this.f11207i.put(str, c1614n);
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("timestamp");
/* 21 */            c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11203c.doubleValue()));
/* 26 */            c1505c.m5291p("trace_id");
/* 31 */            c1505c.m5297v(iLogger, this.f11201a);
/* 36 */            if (this.f11202b != null) {
/* 40 */                c1505c.m5291p("span_id");
/* 45 */                c1505c.m5297v(iLogger, this.f11202b);
                    }
/* 50 */            c1505c.m5291p("body");
/* 55 */            c1505c.m5300y(this.f11204d);
/* 60 */            c1505c.m5291p(FirebaseAnalytics.Param.LEVEL);
/* 65 */            c1505c.m5297v(iLogger, this.f11205e);
/* 70 */            if (this.f11206f != null) {
/* 74 */                c1505c.m5291p("severity_number");
/* 79 */                c1505c.m5297v(iLogger, this.f11206f);
                    }
/* 84 */            if (this.f11207i != null) {
/* 88 */                c1505c.m5291p("attributes");
/* 93 */                c1505c.m5297v(iLogger, this.f11207i);
                    }
/* 96 */            HashMap map = this.f11208v;
/* 98 */            if (map != null) {
/* 112 */               for (String str : map.keySet()) {
/* 122 */                   AbstractC0298j.m1862c(this.f11208v, str, c1505c, str, iLogger);
                        }
                    }
/* 126 */           c1505c.m5288l();
                }
            }
