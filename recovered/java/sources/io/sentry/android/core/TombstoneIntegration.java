            package io.sentry.android.core;

            import android.content.Context;
            import io.sentry.C1532l;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.transport.C1678d;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TombstoneIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public final Context f9906a;

                /* JADX INFO: renamed from: b */
                public final C1678d f9907b;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9908c;

                public TombstoneIntegration(Context context) {
/* 4 */             Context applicationContext = context.getApplicationContext();
/* 11 */            this.f9906a = applicationContext != null ? applicationContext : context;
/* 15 */            this.f9907b = C1678d.f11692a;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9908c;
/* 3 */             if (sentryAndroidOptions != null) {
/* 16 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "TombstoneIntegration removed.", new Object[0]);
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9908c = sentryAndroidOptions;
/* 25 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.f9908c.isTombstoneEnabled()));
/* 34 */            if (this.f9908c.isTombstoneEnabled()) {
/* 43 */                if (this.f9908c.getCacheDirPath() == null) {
/* 57 */                    this.f9908c.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
/* 60 */                    return;
                        }
                        try {
/* 61 */                    InterfaceC1457g1 executorService = sentryAndroidOptions.getExecutorService();
/* 67 */                    Context context = this.f9906a;
/* 69 */                    SentryAndroidOptions sentryAndroidOptions2 = this.f9908c;
/* 81 */                    executorService.submit(new RunnableC1236k0(context, sentryAndroidOptions2, this.f9907b, new C1532l(context, sentryAndroidOptions2)));
                        } catch (Throwable th) {
/* 94 */                    sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to start tombstone processor.", th);
                        }
/* 107 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "TombstoneIntegration installed.", new Object[0]);
/* 112 */               AbstractC1704c.m5446a("Tombstone");
                    }
                }
            }
