            package io.sentry.protocol.profiling;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.profiling.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1618b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public double f11429a;

                /* JADX INFO: renamed from: b */
                public int f11430b;

                /* JADX INFO: renamed from: c */
                public String f11431c;

                /* JADX INFO: renamed from: d */
                public HashMap f11432d;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("timestamp");
/* 17 */            c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11429a));
/* 22 */            c1505c.m5291p("stack_id");
/* 31 */            c1505c.m5297v(iLogger, Integer.valueOf(this.f11430b));
/* 36 */            if (this.f11431c != null) {
/* 40 */                c1505c.m5291p("thread_id");
/* 45 */                c1505c.m5297v(iLogger, this.f11431c);
                    }
/* 48 */            HashMap map = this.f11432d;
/* 50 */            if (map != null) {
/* 64 */                for (String str : map.keySet()) {
/* 74 */                    AbstractC0298j.m1862c(this.f11432d, str, c1505c, str, iLogger);
                        }
                    }
/* 78 */            c1505c.m5288l();
                }
            }
