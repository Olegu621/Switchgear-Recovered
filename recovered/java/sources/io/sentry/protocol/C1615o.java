            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1615o implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public Boolean f11409U;

                /* JADX INFO: renamed from: V */
                public HashMap f11410V;

                /* JADX INFO: renamed from: a */
                public String f11411a;

                /* JADX INFO: renamed from: b */
                public String f11412b;

                /* JADX INFO: renamed from: c */
                public String f11413c;

                /* JADX INFO: renamed from: d */
                public Boolean f11414d;

                /* JADX INFO: renamed from: e */
                public AbstractMap f11415e;

                /* JADX INFO: renamed from: f */
                public ConcurrentHashMap f11416f;

                /* JADX INFO: renamed from: i */
                public Boolean f11417i;

                /* JADX INFO: renamed from: v */
                public Integer f11418v;

                /* JADX INFO: renamed from: w */
                public Integer f11419w;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11411a != null) {
/* 12 */                c1505c.m5291p("type");
/* 17 */                c1505c.m5300y(this.f11411a);
                    }
/* 22 */            if (this.f11412b != null) {
/* 26 */                c1505c.m5291p("description");
/* 31 */                c1505c.m5300y(this.f11412b);
                    }
/* 36 */            if (this.f11413c != null) {
/* 40 */                c1505c.m5291p("help_link");
/* 45 */                c1505c.m5300y(this.f11413c);
                    }
/* 50 */            if (this.f11414d != null) {
/* 54 */                c1505c.m5291p("handled");
/* 59 */                c1505c.m5298w(this.f11414d);
                    }
/* 64 */            if (this.f11415e != null) {
/* 68 */                c1505c.m5291p("meta");
/* 73 */                c1505c.m5297v(iLogger, this.f11415e);
                    }
/* 78 */            if (this.f11416f != null) {
/* 82 */                c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 87 */                c1505c.m5297v(iLogger, this.f11416f);
                    }
/* 92 */            if (this.f11417i != null) {
/* 96 */                c1505c.m5291p("synthetic");
/* 101 */               c1505c.m5298w(this.f11417i);
                    }
/* 106 */           if (this.f11418v != null) {
/* 110 */               c1505c.m5291p("exception_id");
/* 115 */               c1505c.m5297v(iLogger, this.f11418v);
                    }
/* 120 */           if (this.f11419w != null) {
/* 124 */               c1505c.m5291p("parent_id");
/* 129 */               c1505c.m5297v(iLogger, this.f11419w);
                    }
/* 134 */           if (this.f11409U != null) {
/* 138 */               c1505c.m5291p("is_exception_group");
/* 143 */               c1505c.m5298w(this.f11409U);
                    }
/* 146 */           HashMap map = this.f11410V;
/* 148 */           if (map != null) {
/* 162 */               for (String str : map.keySet()) {
/* 172 */                   AbstractC0298j.m1862c(this.f11410V, str, c1505c, str, iLogger);
                        }
                    }
/* 176 */           c1505c.m5288l();
                }
            }
