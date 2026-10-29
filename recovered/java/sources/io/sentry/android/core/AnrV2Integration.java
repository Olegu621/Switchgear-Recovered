            package io.sentry.android.core;

            import android.content.Context;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.transport.C1678d;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AnrV2Integration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public final Context f9844a;

                /* JADX INFO: renamed from: b */
                public final C1678d f9845b;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9846c;

                public AnrV2Integration(Context context) {
/* 4 */             Context applicationContext = context.getApplicationContext();
/* 11 */            this.f9844a = applicationContext != null ? applicationContext : context;
/* 15 */            this.f9845b = C1678d.f11692a;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9846c;
/* 3 */             if (sentryAndroidOptions != null) {
/* 16 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "AnrV2Integration removed.", new Object[0]);
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9846c = sentryAndroidOptions;
/* 25 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f9846c.isAnrEnabled()));
/* 30 */            String cacheDirPath = this.f9846c.getCacheDirPath();
/* 34 */            SentryAndroidOptions sentryAndroidOptions2 = this.f9846c;
/* 37 */            if (cacheDirPath == null) {
/* 49 */                sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
/* 52 */                return;
                    }
/* 57 */            if (sentryAndroidOptions2.isAnrEnabled()) {
                        try {
/* 59 */                    InterfaceC1457g1 executorService = sentryAndroidOptions.getExecutorService();
/* 65 */                    Context context = this.f9844a;
/* 67 */                    SentryAndroidOptions sentryAndroidOptions3 = this.f9846c;
/* 79 */                    executorService.submit(new RunnableC1236k0(context, sentryAndroidOptions3, this.f9845b, new C1283x(sentryAndroidOptions3)));
                        } catch (Throwable th) {
/* 92 */                    sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to start ANR processor.", th);
                        }
/* 105 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "AnrV2Integration installed.", new Object[0]);
/* 110 */               AbstractC1704c.m5446a("AnrV2");
                    }
                }
            }
