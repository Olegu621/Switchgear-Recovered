            package io.sentry.cache;

            import io.sentry.AbstractC1436e4;
            import io.sentry.C1380b4;
            import io.sentry.C1383b7;
            import io.sentry.C1443f;
            import io.sentry.C1449f5;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.C1195h1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.capture.RunnableC1303e;
            import io.sentry.cache.tape.AbstractC1407f;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.C1708g;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import p000.RunnableC2558zo;
            import p000.f72;
            
            /* JADX INFO: renamed from: io.sentry.cache.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1401f extends AbstractC1436e4 {

                /* JADX INFO: renamed from: c */
                public static final Charset f10808c = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10809a;

                /* JADX INFO: renamed from: b */
                public final C1708g f10810b = new C1708g(new C1195h1(this, 7));

                public C1401f(SentryAndroidOptions sentryAndroidOptions) {
/* 17 */            this.f10809a = sentryAndroidOptions;
                }

                /* JADX INFO: renamed from: a */
                public final void m5127a(String str) {
/* 5 */             AbstractC1396a.m5113a(this.f10809a, ".scope-cache", str);
                }

                /* JADX INFO: renamed from: b */
                public final Object m5128b(C1554m6 c1554m6, String str, Class cls) {
/* 7 */             if (!str.equals("breadcrumbs.json")) {
/* 44 */                return AbstractC1396a.m5115c(c1554m6, ".scope-cache", str, cls);
                    }
                    try {
/* 21 */                return cls.cast(((AbstractC1407f) this.f10810b.m5471a()).m5134f());
                    } catch (IOException unused) {
/* 37 */                c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
/* 40 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5129c(Runnable runnable) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10809a;
/* 7 */             if (sentryAndroidOptions.isEnableScopePersistence()) {
/* 16 */                if (Thread.currentThread() instanceof C1449f5) {
                            try {
/* 18 */                        runnable.run();
/* 21 */                        return;
                            } catch (Throwable th) {
/* 31 */                        sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Serialization task failed", th);
/* 34 */                        return;
                            }
                        }
                        try {
/* 45 */                    sentryAndroidOptions.getExecutorService().submit(new RunnableC1303e(6, this, runnable));
                        } catch (Throwable th2) {
/* 58 */                    sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Serialization task could not be scheduled", th2);
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: i */
                public final void mo4967i(C1443f c1443f) {
/* 7 */             m5129c(new RunnableC1303e(3, this, c1443f));
                }

                @Override // io.sentry.AbstractC1436e4, io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: k */
                public final void mo5059k(C1626w c1626w) {
/* 7 */             m5129c(new RunnableC1303e(4, this, c1626w));
                }

                @Override // io.sentry.AbstractC1436e4, io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: l */
                public final void mo5060l(Collection collection) {
/* 5 */             if (collection.isEmpty()) {
/* 14 */                m5129c(new f72(this, 29));
                    }
                }

                @Override // io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: n */
                public final void mo4970n(C1383b7 c1383b7, C1380b4 c1380b4) {
/* 8 */             m5129c(new RunnableC2558zo(20, this, c1383b7, c1380b4));
                }

                @Override // io.sentry.AbstractC1436e4, io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: o */
                public final void mo5061o(C1597e c1597e) {
/* 7 */             m5129c(new RunnableC1303e(7, this, c1597e));
                }

                @Override // io.sentry.AbstractC1436e4, io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: p */
                public final void mo5062p(String str) {
/* 7 */             m5129c(new RunnableC1303e(5, this, str));
                }
            }
