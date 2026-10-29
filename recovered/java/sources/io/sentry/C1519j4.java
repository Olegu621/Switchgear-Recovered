            package io.sentry;

            import io.sentry.android.core.C1250p;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import p000.fk2;
            
            /* JADX INFO: renamed from: io.sentry.j4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1519j4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11065a;

                /* JADX INFO: renamed from: b */
                public final C1250p f11066b;

                public /* synthetic */ C1519j4(C1250p c1250p, int i) {
/* 1 */             this.f11065a = i;
/* 3 */             this.f11066b = c1250p;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m5329b(String str, ILogger iLogger) {
/* 1 */             if (str != null && !str.isEmpty()) {
/* 10 */                return true;
                    }
/* 19 */            iLogger.mo4672k(EnumC1553m5.INFO, "No cached dir path is defined in options.", new Object[0]);
/* 16 */            return false;
                }

                /* JADX INFO: renamed from: a */
                public final fk2 m5330a(InterfaceC1389c1 interfaceC1389c1, C1554m6 c1554m6) {
/* 1 */             int i = this.f11065a;
/* 5 */             C1250p c1250p = this.f11066b;
                    switch (i) {
                        case 0:
/* 97 */                    AbstractC1704c.m5462q(interfaceC1389c1, "Scopes are required");
/* 100 */                   AbstractC1704c.m5462q(c1554m6, "SentryOptions is required");
/* 105 */                   String cacheDirPath = c1250p.f10235b.getCacheDirPath();
/* 109 */                   if (cacheDirPath == null || !m5329b(cacheDirPath, c1554m6.getLogger())) {
/* 168 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "No cache dir path is defined in options.", new Object[0]);
/* 3 */                         return null;
                            }
/* 154 */                   return new fk2(c1554m6.getLogger(), cacheDirPath, new C1376b0(interfaceC1389c1, c1554m6.getSerializer(), c1554m6.getLogger(), c1554m6.getFlushTimeoutMillis(), c1554m6.getMaxQueueSize()), new File(cacheDirPath));
                        default:
/* 14 */                    AbstractC1704c.m5462q(interfaceC1389c1, "Scopes are required");
/* 17 */                    AbstractC1704c.m5462q(c1554m6, "SentryOptions is required");
/* 22 */                    String outboxPath = c1250p.f10235b.getOutboxPath();
/* 26 */                    if (outboxPath == null || !m5329b(outboxPath, c1554m6.getLogger())) {
/* 90 */                        c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
/* 3 */                         return null;
                            }
/* 76 */                    return new fk2(c1554m6.getLogger(), outboxPath, new C1527k3(interfaceC1389c1, c1554m6.getEnvelopeReader(), c1554m6.getSerializer(), c1554m6.getLogger(), c1554m6.getFlushTimeoutMillis(), c1554m6.getMaxQueueSize()), new File(outboxPath));
                    }
                }
            }
