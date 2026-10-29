            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.o6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1576o6 extends AbstractC1635q4 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a0 */
                public File f11209a0;

                /* JADX INFO: renamed from: e0 */
                public int f11213e0;

                /* JADX INFO: renamed from: g0 */
                public Date f11215g0;

                /* JADX INFO: renamed from: k0 */
                public HashMap f11219k0;

                /* JADX INFO: renamed from: d0 */
                public C1626w f11212d0 = new C1626w();

                /* JADX INFO: renamed from: b0 */
                public String f11210b0 = "replay_event";

                /* JADX INFO: renamed from: c0 */
                public EnumC1567n6 f11211c0 = EnumC1567n6.SESSION;

                /* JADX INFO: renamed from: i0 */
                public List f11217i0 = new ArrayList();

                /* JADX INFO: renamed from: j0 */
                public List f11218j0 = new ArrayList();

                /* JADX INFO: renamed from: h0 */
                public List f11216h0 = new ArrayList();

                /* JADX INFO: renamed from: f0 */
                public Date f11214f0 = new Date();

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1576o6.class == obj.getClass()) {
/* 17 */                C1576o6 c1576o6 = (C1576o6) obj;
/* 23 */                if (this.f11213e0 == c1576o6.f11213e0 && AbstractC1704c.m5453h(this.f11210b0, c1576o6.f11210b0) && this.f11211c0 == c1576o6.f11211c0 && AbstractC1704c.m5453h(this.f11212d0, c1576o6.f11212d0) && AbstractC1704c.m5453h(this.f11216h0, c1576o6.f11216h0) && AbstractC1704c.m5453h(this.f11217i0, c1576o6.f11217i0) && AbstractC1704c.m5453h(this.f11218j0, c1576o6.f11218j0)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{this.f11210b0, this.f11211c0, this.f11212d0, Integer.valueOf(this.f11213e0), this.f11216h0, this.f11217i0, this.f11218j0});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("type");
/* 13 */            c1505c.m5300y(this.f11210b0);
/* 18 */            c1505c.m5291p("replay_type");
/* 23 */            c1505c.m5297v(iLogger, this.f11211c0);
/* 28 */            c1505c.m5291p("segment_id");
/* 34 */            c1505c.m5296u(this.f11213e0);
/* 39 */            c1505c.m5291p("timestamp");
/* 44 */            c1505c.m5297v(iLogger, this.f11214f0);
/* 49 */            if (this.f11212d0 != null) {
/* 53 */                c1505c.m5291p("replay_id");
/* 58 */                c1505c.m5297v(iLogger, this.f11212d0);
                    }
/* 63 */            if (this.f11215g0 != null) {
/* 67 */                c1505c.m5291p("replay_start_timestamp");
/* 72 */                c1505c.m5297v(iLogger, this.f11215g0);
                    }
/* 77 */            if (this.f11216h0 != null) {
/* 81 */                c1505c.m5291p("urls");
/* 86 */                c1505c.m5297v(iLogger, this.f11216h0);
                    }
/* 91 */            if (this.f11217i0 != null) {
/* 95 */                c1505c.m5291p("error_ids");
/* 100 */               c1505c.m5297v(iLogger, this.f11217i0);
                    }
/* 105 */           if (this.f11218j0 != null) {
/* 109 */               c1505c.m5291p("trace_ids");
/* 114 */               c1505c.m5297v(iLogger, this.f11218j0);
                    }
/* 117 */           AbstractC1417a.m5181u(this, c1505c, iLogger);
/* 120 */           HashMap map = this.f11219k0;
/* 122 */           if (map != null) {
/* 136 */               for (String str : map.keySet()) {
/* 146 */                   AbstractC0298j.m1862c(this.f11219k0, str, c1505c, str, iLogger);
                        }
                    }
/* 150 */           c1505c.m5288l();
                }
            }
