            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.e0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1598e0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public Map f11296U;

                /* JADX INFO: renamed from: V */
                public ConcurrentHashMap f11297V;

                /* JADX INFO: renamed from: a */
                public Long f11298a;

                /* JADX INFO: renamed from: b */
                public Integer f11299b;

                /* JADX INFO: renamed from: c */
                public String f11300c;

                /* JADX INFO: renamed from: d */
                public String f11301d;

                /* JADX INFO: renamed from: e */
                public Boolean f11302e;

                /* JADX INFO: renamed from: f */
                public Boolean f11303f;

                /* JADX INFO: renamed from: i */
                public Boolean f11304i;

                /* JADX INFO: renamed from: v */
                public Boolean f11305v;

                /* JADX INFO: renamed from: w */
                public C1594c0 f11306w;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11298a != null) {
/* 12 */                c1505c.m5291p("id");
/* 17 */                c1505c.m5299x(this.f11298a);
                    }
/* 22 */            if (this.f11299b != null) {
/* 26 */                c1505c.m5291p("priority");
/* 31 */                c1505c.m5299x(this.f11299b);
                    }
/* 36 */            if (this.f11300c != null) {
/* 40 */                c1505c.m5291p("name");
/* 45 */                c1505c.m5300y(this.f11300c);
                    }
/* 50 */            if (this.f11301d != null) {
/* 54 */                c1505c.m5291p("state");
/* 59 */                c1505c.m5300y(this.f11301d);
                    }
/* 64 */            if (this.f11302e != null) {
/* 68 */                c1505c.m5291p("crashed");
/* 73 */                c1505c.m5298w(this.f11302e);
                    }
/* 78 */            if (this.f11303f != null) {
/* 82 */                c1505c.m5291p("current");
/* 87 */                c1505c.m5298w(this.f11303f);
                    }
/* 92 */            if (this.f11304i != null) {
/* 96 */                c1505c.m5291p("daemon");
/* 101 */               c1505c.m5298w(this.f11304i);
                    }
/* 106 */           if (this.f11305v != null) {
/* 110 */               c1505c.m5291p("main");
/* 115 */               c1505c.m5298w(this.f11305v);
                    }
/* 120 */           if (this.f11306w != null) {
/* 124 */               c1505c.m5291p("stacktrace");
/* 129 */               c1505c.m5297v(iLogger, this.f11306w);
                    }
/* 134 */           if (this.f11296U != null) {
/* 138 */               c1505c.m5291p("held_locks");
/* 143 */               c1505c.m5297v(iLogger, this.f11296U);
                    }
/* 146 */           ConcurrentHashMap concurrentHashMap = this.f11297V;
/* 148 */           if (concurrentHashMap != null) {
/* 162 */               for (String str : concurrentHashMap.keySet()) {
/* 172 */                   AbstractC0298j.m1863d(this.f11297V, str, c1505c, str, iLogger);
                        }
                    }
/* 176 */           c1505c.m5288l();
                }
            }
