            package io.sentry.protocol.profiling;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.profiling.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1619c implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11433a;

                /* JADX INFO: renamed from: b */
                public int f11434b;

                /* JADX INFO: renamed from: c */
                public HashMap f11435c;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11433a != null) {
/* 12 */                c1505c.m5291p("name");
/* 17 */                c1505c.m5297v(iLogger, this.f11433a);
                    }
/* 22 */            c1505c.m5291p("priority");
/* 31 */            c1505c.m5297v(iLogger, Integer.valueOf(this.f11434b));
/* 34 */            HashMap map = this.f11435c;
/* 36 */            if (map != null) {
/* 50 */                for (String str : map.keySet()) {
/* 60 */                    AbstractC0298j.m1862c(this.f11435c, str, c1505c, str, iLogger);
                        }
                    }
/* 64 */            c1505c.m5288l();
                }
            }
