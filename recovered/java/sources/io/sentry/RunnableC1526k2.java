            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.capture.C1299a;
            import io.sentry.cache.C1398c;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.logger.C1545e;
            import io.sentry.metrics.C1558c;
            import io.sentry.util.C1702a;
            import java.io.File;
            import java.nio.charset.Charset;
            import p000.t60;
            
            /* JADX INFO: renamed from: io.sentry.k2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1526k2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11079a;

                /* JADX INFO: renamed from: b */
                public final Object f11080b;

                public /* synthetic */ RunnableC1526k2(Object obj, int i) {
/* 1 */             this.f11079a = i;
/* 3 */             this.f11080b = obj;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f11079a) {
                        case 0:
/* 160 */                   SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f11080b;
/* 162 */                   String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 166 */                   if (cacheDirPath == null) {
/* 178 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
/* 216 */                       return;
                            }
/* 182 */                   InterfaceC1399d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
/* 188 */                   if (envelopeDiskCache instanceof C1398c) {
/* 190 */                       Charset charset = C1398c.f10798w;
/* 206 */                       C1398c c1398c = (C1398c) envelopeDiskCache;
/* 208 */                       c1398c.m5119c(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
/* 213 */                       c1398c.f10803e.countDown();
/* 216 */                       return;
                            }
/* 216 */                   return;
                        case 1:
/* 154 */                   ((C1299a) this.f11080b).invoke();
/* 157 */                   return;
                        case 2:
/* 146 */                   ((t60) this.f11080b).invoke();
/* 149 */                   return;
                        case 3:
/* 138 */                   ((t60) this.f11080b).invoke();
/* 141 */                   return;
                        case 4:
/* 130 */                   ((C1299a) this.f11080b).invoke();
/* 133 */                   return;
                        case 5:
/* 122 */                   ((C1299a) this.f11080b).invoke();
/* 125 */                   return;
                        case 6:
/* 114 */                   ((C1299a) this.f11080b).invoke();
/* 117 */                   return;
                        case 7:
/* 60 */                    C1545e c1545e = (C1545e) this.f11080b;
/* 73 */                    do {
/* 62 */                        c1545e.m5347e();
/* 73 */                    } while (c1545e.f11125c.size() >= 100);
/* 75 */                    C1702a c1702a = c1545e.f11128f;
/* 77 */                    c1702a.m5443c();
                            try {
/* 86 */                        if (c1545e.f11125c.isEmpty()) {
/* 95 */                            c1545e.f11129i = false;
                                } else {
/* 89 */                            c1545e.m5348g(true, false);
                                }
/* 97 */                        c1702a.close();
/* 100 */                       return;
                            } catch (Throwable th) {
                                try {
/* 101 */                           c1702a.close();
                                    break;
                                } catch (Throwable th2) {
/* 106 */                           th.addSuppressed(th2);
                                }
/* 109 */                       throw th;
                            }
                        default:
/* 10 */                    C1558c c1558c = (C1558c) this.f11080b;
/* 23 */                    do {
/* 12 */                        c1558c.m5367d();
/* 23 */                    } while (c1558c.f11152c.size() >= 1000);
/* 25 */                    C1702a c1702a2 = c1558c.f11155f;
/* 27 */                    c1702a2.m5443c();
                            try {
/* 36 */                        if (!c1558c.f11152c.isEmpty()) {
/* 38 */                            c1558c.m5368e(false);
                                    break;
                                }
/* 44 */                        c1702a2.close();
/* 47 */                        return;
                            } catch (Throwable th3) {
                                try {
/* 48 */                            c1702a2.close();
                                    break;
                                } catch (Throwable th4) {
/* 53 */                            th3.addSuppressed(th4);
                                }
/* 56 */                        throw th3;
                            }
                    }
                }
            }
