            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1621r implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public String f11443U;

                /* JADX INFO: renamed from: V */
                public String f11444V;

                /* JADX INFO: renamed from: W */
                public ConcurrentHashMap f11445W;

                /* JADX INFO: renamed from: a */
                public String f11446a;

                /* JADX INFO: renamed from: b */
                public String f11447b;

                /* JADX INFO: renamed from: c */
                public String f11448c;

                /* JADX INFO: renamed from: d */
                public Object f11449d;

                /* JADX INFO: renamed from: e */
                public String f11450e;

                /* JADX INFO: renamed from: f */
                public ConcurrentHashMap f11451f;

                /* JADX INFO: renamed from: i */
                public ConcurrentHashMap f11452i;

                /* JADX INFO: renamed from: v */
                public Long f11453v;

                /* JADX INFO: renamed from: w */
                public ConcurrentHashMap f11454w;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 107 */               return true;
                    }
/* 4 */             if (obj == null || C1621r.class != obj.getClass()) {
/* 109 */               return false;
                    }
/* 15 */            C1621r c1621r = (C1621r) obj;
                    return AbstractC1704c.m5453h(this.f11446a, c1621r.f11446a) && AbstractC1704c.m5453h(this.f11447b, c1621r.f11447b) && AbstractC1704c.m5453h(this.f11448c, c1621r.f11448c) && AbstractC1704c.m5453h(this.f11450e, c1621r.f11450e) && AbstractC1704c.m5453h(this.f11451f, c1621r.f11451f) && AbstractC1704c.m5453h(this.f11452i, c1621r.f11452i) && AbstractC1704c.m5453h(this.f11453v, c1621r.f11453v) && AbstractC1704c.m5453h(this.f11443U, c1621r.f11443U) && AbstractC1704c.m5453h(this.f11444V, c1621r.f11444V);
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{this.f11446a, this.f11447b, this.f11448c, this.f11450e, this.f11451f, this.f11452i, this.f11453v, this.f11443U, this.f11444V});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11446a != null) {
/* 12 */                c1505c.m5291p("url");
/* 17 */                c1505c.m5300y(this.f11446a);
                    }
/* 22 */            if (this.f11447b != null) {
/* 26 */                c1505c.m5291p(FirebaseAnalytics.Param.METHOD);
/* 31 */                c1505c.m5300y(this.f11447b);
                    }
/* 36 */            if (this.f11448c != null) {
/* 40 */                c1505c.m5291p("query_string");
/* 45 */                c1505c.m5300y(this.f11448c);
                    }
/* 50 */            if (this.f11449d != null) {
/* 54 */                c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 59 */                c1505c.m5297v(iLogger, this.f11449d);
                    }
/* 64 */            if (this.f11450e != null) {
/* 68 */                c1505c.m5291p("cookies");
/* 73 */                c1505c.m5300y(this.f11450e);
                    }
/* 78 */            if (this.f11451f != null) {
/* 82 */                c1505c.m5291p("headers");
/* 87 */                c1505c.m5297v(iLogger, this.f11451f);
                    }
/* 92 */            if (this.f11452i != null) {
/* 96 */                c1505c.m5291p(SharedDataContentProvider.QUERY_PARAM_ENV);
/* 101 */               c1505c.m5297v(iLogger, this.f11452i);
                    }
/* 106 */           if (this.f11454w != null) {
/* 110 */               c1505c.m5291p("other");
/* 115 */               c1505c.m5297v(iLogger, this.f11454w);
                    }
/* 120 */           if (this.f11443U != null) {
/* 124 */               c1505c.m5291p("fragment");
/* 129 */               c1505c.m5297v(iLogger, this.f11443U);
                    }
/* 134 */           if (this.f11453v != null) {
/* 138 */               c1505c.m5291p("body_size");
/* 143 */               c1505c.m5297v(iLogger, this.f11453v);
                    }
/* 148 */           if (this.f11444V != null) {
/* 152 */               c1505c.m5291p("api_target");
/* 157 */               c1505c.m5297v(iLogger, this.f11444V);
                    }
/* 160 */           ConcurrentHashMap concurrentHashMap = this.f11445W;
/* 162 */           if (concurrentHashMap != null) {
/* 176 */               for (String str : concurrentHashMap.keySet()) {
/* 186 */                   AbstractC0298j.m1863d(this.f11445W, str, c1505c, str, iLogger);
                        }
                    }
/* 190 */           c1505c.m5288l();
                }
            }
