            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.C1529k5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.concurrent.CopyOnWriteArraySet;
            
            /* JADX INFO: renamed from: io.sentry.protocol.u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1624u implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11466a;

                /* JADX INFO: renamed from: b */
                public String f11467b;

                /* JADX INFO: renamed from: c */
                public CopyOnWriteArraySet f11468c;

                /* JADX INFO: renamed from: d */
                public CopyOnWriteArraySet f11469d;

                /* JADX INFO: renamed from: e */
                public HashMap f11470e;

                public C1624u(String str, String str2) {
/* 4 */             this.f11466a = str;
/* 6 */             this.f11467b = str2;
                }

                /* JADX INFO: renamed from: a */
                public final String m5378a() {
/* 1 */             return this.f11466a;
                }

                /* JADX INFO: renamed from: b */
                public final String m5379b() {
/* 1 */             return this.f11467b;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C1624u.class == obj.getClass()) {
/* 17 */                C1624u c1624u = (C1624u) obj;
/* 27 */                if (this.f11466a.equals(c1624u.f11466a) && this.f11467b.equals(c1624u.f11467b)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f11466a, this.f11467b});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("name");
/* 13 */            c1505c.m5300y(this.f11466a);
/* 18 */            c1505c.m5291p("version");
/* 23 */            c1505c.m5300y(this.f11467b);
/* 26 */            CopyOnWriteArraySet copyOnWriteArraySet = this.f11468c;
/* 28 */            if (copyOnWriteArraySet == null) {
/* 35 */                copyOnWriteArraySet = C1529k5.m5336d().f11093b;
                    }
/* 37 */            CopyOnWriteArraySet copyOnWriteArraySet2 = this.f11469d;
/* 39 */            if (copyOnWriteArraySet2 == null) {
/* 46 */                copyOnWriteArraySet2 = C1529k5.m5336d().f11092a;
                    }
/* 52 */            if (!copyOnWriteArraySet.isEmpty()) {
/* 56 */                c1505c.m5291p("packages");
/* 59 */                c1505c.m5297v(iLogger, copyOnWriteArraySet);
                    }
/* 66 */            if (!copyOnWriteArraySet2.isEmpty()) {
/* 70 */                c1505c.m5291p("integrations");
/* 73 */                c1505c.m5297v(iLogger, copyOnWriteArraySet2);
                    }
/* 76 */            HashMap map = this.f11470e;
/* 78 */            if (map != null) {
/* 92 */                for (String str : map.keySet()) {
/* 102 */                   AbstractC0298j.m1862c(this.f11470e, str, c1505c, str, iLogger);
                        }
                    }
/* 106 */           c1505c.m5288l();
                }
            }
