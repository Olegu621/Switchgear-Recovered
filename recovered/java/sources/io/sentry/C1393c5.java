            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1625v;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.c5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C1393c5 extends AbstractC1635q4 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a0 */
                public Date f10782a0;

                /* JADX INFO: renamed from: b0 */
                public C1616p f10783b0;

                /* JADX INFO: renamed from: c0 */
                public String f10784c0;

                /* JADX INFO: renamed from: d0 */
                public C1425d2 f10785d0;

                /* JADX INFO: renamed from: e0 */
                public C1425d2 f10786e0;

                /* JADX INFO: renamed from: f0 */
                public EnumC1553m5 f10787f0;

                /* JADX INFO: renamed from: g0 */
                public String f10788g0;

                /* JADX INFO: renamed from: h0 */
                public List f10789h0;

                /* JADX INFO: renamed from: i0 */
                public ConcurrentHashMap f10790i0;

                /* JADX INFO: renamed from: j0 */
                public AbstractMap f10791j0;

                public C1393c5() {
/* 3 */             C1626w c1626w = new C1626w();
/* 8 */             Date date = new Date();
/* 11 */            super(c1626w);
/* 14 */            this.f10782a0 = date;
                }

                /* JADX INFO: renamed from: d */
                public final ArrayList m5107d() {
/* 1 */             C1425d2 c1425d2 = this.f10786e0;
/* 3 */             if (c1425d2 == null) {
/* 5 */                 return null;
                    }
/* 7 */             return c1425d2.f10848a;
                }

                /* JADX INFO: renamed from: e */
                public final ArrayList m5108e() {
/* 1 */             C1425d2 c1425d2 = this.f10785d0;
/* 3 */             if (c1425d2 != null) {
/* 5 */                 return c1425d2.f10848a;
                    }
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: f */
                public final C1625v m5109f() {
                    Boolean bool;
/* 1 */             C1425d2 c1425d2 = this.f10786e0;
/* 3 */             if (c1425d2 == null) {
/* 38 */                return null;
                    }
/* 15 */            for (C1625v c1625v : c1425d2.f10848a) {
/* 23 */                C1615o c1615o = c1625v.f11476f;
/* 25 */                if (c1615o != null && (bool = c1615o.f11414d) != null && !bool.booleanValue()) {
/* 37 */                    return c1625v;
                        }
                    }
/* 38 */            return null;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m5110g() {
/* 1 */             C1425d2 c1425d2 = this.f10786e0;
                    return (c1425d2 == null || c1425d2.f10848a.isEmpty()) ? false : true;
                }

                /* JADX INFO: renamed from: h */
                public final void m5111h(List list) {
/* 10 */            this.f10789h0 = list != null ? new ArrayList(list) : null;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("timestamp");
/* 13 */            c1505c.m5297v(iLogger, this.f10782a0);
/* 18 */            if (this.f10783b0 != null) {
/* 22 */                c1505c.m5291p("message");
/* 27 */                c1505c.m5297v(iLogger, this.f10783b0);
                    }
/* 32 */            if (this.f10784c0 != null) {
/* 36 */                c1505c.m5291p("logger");
/* 41 */                c1505c.m5300y(this.f10784c0);
                    }
/* 44 */            C1425d2 c1425d2 = this.f10785d0;
/* 48 */            if (c1425d2 != null && !c1425d2.f10848a.isEmpty()) {
/* 60 */                c1505c.m5291p("threads");
/* 63 */                c1505c.m5287i();
/* 66 */                c1505c.m5291p("values");
/* 73 */                c1505c.m5297v(iLogger, this.f10785d0.f10848a);
/* 76 */                c1505c.m5288l();
                    }
/* 79 */            C1425d2 c1425d3 = this.f10786e0;
/* 81 */            if (c1425d3 != null && !c1425d3.f10848a.isEmpty()) {
/* 93 */                c1505c.m5291p("exception");
/* 96 */                c1505c.m5287i();
/* 99 */                c1505c.m5291p("values");
/* 106 */               c1505c.m5297v(iLogger, this.f10786e0.f10848a);
/* 109 */               c1505c.m5288l();
                    }
/* 114 */           if (this.f10787f0 != null) {
/* 118 */               c1505c.m5291p(FirebaseAnalytics.Param.LEVEL);
/* 123 */               c1505c.m5297v(iLogger, this.f10787f0);
                    }
/* 128 */           if (this.f10788g0 != null) {
/* 132 */               c1505c.m5291p("transaction");
/* 137 */               c1505c.m5300y(this.f10788g0);
                    }
/* 142 */           if (this.f10789h0 != null) {
/* 146 */               c1505c.m5291p("fingerprint");
/* 151 */               c1505c.m5297v(iLogger, this.f10789h0);
                    }
/* 156 */           if (this.f10791j0 != null) {
/* 160 */               c1505c.m5291p("modules");
/* 165 */               c1505c.m5297v(iLogger, this.f10791j0);
                    }
/* 168 */           AbstractC1417a.m5181u(this, c1505c, iLogger);
/* 171 */           ConcurrentHashMap concurrentHashMap = this.f10790i0;
/* 173 */           if (concurrentHashMap != null) {
/* 187 */               for (String str : concurrentHashMap.keySet()) {
/* 197 */                   AbstractC0298j.m1863d(this.f10790i0, str, c1505c, str, iLogger);
                        }
                    }
/* 201 */           c1505c.m5288l();
                }

/* 16 */        public C1393c5(Exception exc) {
/* 17 */            this();
/* 18 */            this.f11510U = exc;
                }
            }
