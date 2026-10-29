            package io.sentry;

            import io.sentry.protocol.C1627x;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.util.concurrent.CopyOnWriteArraySet;
            
            /* JADX INFO: renamed from: io.sentry.k5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1529k5 {

                /* JADX INFO: renamed from: c */
                public static volatile C1529k5 f11088c;

                /* JADX INFO: renamed from: d */
                public static final C1702a f11089d = new C1702a();

                /* JADX INFO: renamed from: e */
                public static volatile Boolean f11090e = null;

                /* JADX INFO: renamed from: f */
                public static final C1702a f11091f = new C1702a();

                /* JADX INFO: renamed from: a */
                public final CopyOnWriteArraySet f11092a = new CopyOnWriteArraySet();

                /* JADX INFO: renamed from: b */
                public final CopyOnWriteArraySet f11093b = new CopyOnWriteArraySet();

                /* JADX INFO: renamed from: d */
                public static C1529k5 m5336d() {
/* 3 */             if (f11088c == null) {
/* 5 */                 C1702a c1702a = f11089d;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (f11088c == null) {
/* 19 */                        f11088c = new C1529k5();
                            }
/* 24 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 28 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 33 */                        th.addSuppressed(th2);
                            }
/* 36 */                    throw th;
                        }
                    }
/* 37 */            return f11088c;
                }

                /* JADX INFO: renamed from: a */
                public final void m5337a(String str) {
/* 3 */             AbstractC1704c.m5462q(str, "integration is required.");
/* 8 */             this.f11092a.add(str);
                }

                /* JADX INFO: renamed from: b */
                public final void m5338b(String str, String str2) {
/* 8 */             this.f11093b.add(new C1627x(str, str2));
/* 11 */            C1702a c1702a = f11091f;
/* 13 */            c1702a.m5443c();
                    try {
/* 17 */                f11090e = null;
/* 19 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 24 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 29 */                    th.addSuppressed(th2);
                        }
/* 32 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final boolean m5339c(ILogger iLogger) {
/* 5 */             Boolean bool = f11090e;
/* 7 */             if (bool != null) {
/* 9 */                 return bool.booleanValue();
                    }
/* 14 */            C1702a c1702a = f11091f;
/* 16 */            c1702a.m5443c();
                    try {
/* 26 */                boolean z = false;
/* 31 */                for (C1627x c1627x : this.f11093b) {
/* 47 */                    if (c1627x.f11480a.startsWith("maven:io.sentry:") && !"8.48.0".equalsIgnoreCase(c1627x.f11481b)) {
/* 69 */                        iLogger.mo4672k(EnumC1553m5.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", c1627x.f11480a, "8.48.0", c1627x.f11481b);
/* 72 */                        z = true;
                            }
                        }
/* 76 */                if (z) {
/* 78 */                    EnumC1553m5 enumC1553m5 = EnumC1553m5.ERROR;
/* 82 */                    iLogger.mo4672k(enumC1553m5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
/* 87 */                    iLogger.mo4672k(enumC1553m5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
/* 92 */                    iLogger.mo4672k(enumC1553m5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
/* 97 */                    iLogger.mo4672k(enumC1553m5, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                        }
/* 104 */               f11090e = Boolean.valueOf(z);
/* 106 */               c1702a.close();
/* 109 */               return z;
                    } catch (Throwable th) {
                        try {
/* 110 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 115 */                   th.addSuppressed(th2);
                        }
/* 118 */               throw th;
                    }
                }
            }
