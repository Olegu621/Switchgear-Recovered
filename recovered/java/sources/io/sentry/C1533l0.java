            package io.sentry;

            import io.sentry.util.C1702a;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.yi0;
            
            /* JADX INFO: renamed from: io.sentry.l0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1533l0 {

                /* JADX INFO: renamed from: g */
                public static volatile C1533l0 f11103g;

                /* JADX INFO: renamed from: h */
                public static final C1702a f11104h = new C1702a();

                /* JADX INFO: renamed from: a */
                public final long f11105a;

                /* JADX INFO: renamed from: b */
                public volatile String f11106b;

                /* JADX INFO: renamed from: c */
                public volatile long f11107c;

                /* JADX INFO: renamed from: d */
                public final AtomicBoolean f11108d;

                /* JADX INFO: renamed from: e */
                public final CallableC1515j0 f11109e;

                /* JADX INFO: renamed from: f */
                public final ExecutorService f11110f;

                public C1533l0() {
/* 4 */             CallableC1515j0 callableC1515j0 = new CallableC1515j0(0);
/* 16 */            this.f11108d = new AtomicBoolean(false);
/* 27 */            this.f11110f = Executors.newSingleThreadExecutor(new ThreadFactoryC1524k0(0));
/* 32 */            this.f11105a = 18000000L;
/* 34 */            this.f11109e = callableC1515j0;
/* 36 */            m5344b();
                }

                /* JADX INFO: renamed from: a */
                public static C1533l0 m5343a() {
/* 3 */             if (f11103g == null) {
/* 5 */                 C1702a c1702a = f11104h;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (f11103g == null) {
/* 19 */                        f11103g = new C1533l0();
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
/* 37 */            return f11103g;
                }

                /* JADX INFO: renamed from: b */
                public final void m5344b() {
                    try {
/* 17 */                this.f11110f.submit(new yi0(this, 1)).get(1000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
/* 33 */                Thread.currentThread().interrupt();
/* 41 */                this.f11107c = System.currentTimeMillis() + 1000;
                    } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
/* 26 */                this.f11107c = System.currentTimeMillis() + 1000;
                    }
                }
            }
