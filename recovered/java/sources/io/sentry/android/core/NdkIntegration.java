            package io.sentry.android.core;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class NdkIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public final Class f9866a;

                /* JADX INFO: renamed from: b */
                public SentryAndroidOptions f9867b;

                public NdkIntegration(Class cls) {
/* 4 */             this.f9866a = cls;
                }

                /* JADX INFO: renamed from: c */
                public static void m4752c(SentryAndroidOptions sentryAndroidOptions) {
/* 2 */             sentryAndroidOptions.setEnableNdk(false);
/* 5 */             sentryAndroidOptions.setEnableScopeSync(false);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9867b;
/* 3 */             if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
/* 92 */                return;
                    }
/* 11 */            Class cls = this.f9866a;
                    try {
/* 13 */                if (cls != null) {
/* 22 */                    cls.getMethod("close", null).invoke(null, null);
/* 38 */                    this.f9867b.getLogger().mo4672k(EnumC1553m5.DEBUG, "NdkIntegration removed.", new Object[0]);
                        }
                    } catch (NoSuchMethodException e) {
/* 82 */                this.f9867b.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                    } catch (Throwable th) {
/* 61 */                this.f9867b.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to close SentryNdk.", th);
                    } finally {
/* 88 */                m4752c(this.f9867b);
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
                    Class cls;
/* 1 */             this.f9867b = sentryAndroidOptions;
/* 3 */             boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
/* 9 */             ILogger logger = this.f9867b.getLogger();
/* 13 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 25 */            logger.mo4672k(enumC1553m5, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
/* 28 */            if (!zIsEnableNdk || (cls = this.f9866a) == null) {
/* 149 */               m4752c(this.f9867b);
/* 152 */               return;
                    }
/* 41 */            if (this.f9867b.getCacheDirPath() == null) {
/* 55 */                this.f9867b.getLogger().mo4672k(EnumC1553m5.ERROR, "No cache dir path is defined in options.", new Object[0]);
/* 60 */                m4752c(this.f9867b);
/* 63 */                return;
                    }
                    try {
/* 83 */                cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f9867b);
/* 96 */                this.f9867b.getLogger().mo4672k(enumC1553m5, "NdkIntegration installed.", new Object[0]);
/* 101 */               AbstractC1704c.m5446a("Ndk");
                    } catch (NoSuchMethodException e) {
/* 130 */               m4752c(this.f9867b);
/* 143 */               this.f9867b.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to invoke the SentryNdk.init method.", e);
                    } catch (Throwable th) {
/* 111 */               m4752c(this.f9867b);
/* 124 */               this.f9867b.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to initialize SentryNdk.", th);
                    }
                }
            }
