            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.exception.C1440a;
            import io.sentry.hints.EnumC1477e;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UncaughtExceptionHandlerIntegration implements InterfaceC1661s1, Thread.UncaughtExceptionHandler, Closeable {

                /* JADX INFO: renamed from: e */
                public static final C1702a f9782e = new C1702a();

                /* JADX INFO: renamed from: a */
                public Thread.UncaughtExceptionHandler f9783a;

                /* JADX INFO: renamed from: b */
                public C1469h4 f9784b;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9785c;

                /* JADX INFO: renamed from: d */
                public boolean f9786d;

                /* JADX INFO: renamed from: c */
                public final void m4675c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
/* 2 */             if (uncaughtExceptionHandler == null) {
/* 4 */                 SentryAndroidOptions sentryAndroidOptions = this.f9785c;
/* 6 */                 if (sentryAndroidOptions != null) {
/* 18 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
/* 21 */                    return;
                        }
/* 78 */                return;
                    }
/* 26 */            if (!hashSet.add(uncaughtExceptionHandler)) {
/* 28 */                SentryAndroidOptions sentryAndroidOptions2 = this.f9785c;
/* 30 */                if (sentryAndroidOptions2 != null) {
/* 42 */                    sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
/* 45 */                    return;
                        }
/* 78 */                return;
                    }
/* 48 */            if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
/* 51 */                UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
/* 53 */                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f9783a;
/* 55 */                if (this != uncaughtExceptionHandler2) {
/* 79 */                    m4675c(uncaughtExceptionHandler2, hashSet);
/* 82 */                    return;
                        }
/* 59 */                uncaughtExceptionHandlerIntegration.f9783a = this.f9783a;
/* 61 */                SentryAndroidOptions sentryAndroidOptions3 = this.f9785c;
/* 63 */                if (sentryAndroidOptions3 != null) {
/* 75 */                    sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = f9782e;
/* 3 */             c1702a.m5443c();
                    try {
/* 10 */                if (this == Thread.getDefaultUncaughtExceptionHandler()) {
/* 14 */                    Thread.setDefaultUncaughtExceptionHandler(this.f9783a);
/* 17 */                    SentryAndroidOptions sentryAndroidOptions = this.f9785c;
/* 19 */                    if (sentryAndroidOptions != null) {
/* 32 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                            }
                        } else {
/* 47 */                    m4675c(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
                        }
/* 50 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 54 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 59 */                    th.addSuppressed(th2);
                        }
/* 62 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
                    UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
                    C1469h4 c1469h4;
/* 1 */             C1469h4 c1469h5 = C1469h4.f10976a;
/* 8 */             if (this.f9786d) {
/* 20 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
/* 23 */                return;
                    }
/* 25 */            this.f9786d = true;
/* 27 */            this.f9784b = c1469h5;
/* 29 */            this.f9785c = sentryAndroidOptions;
/* 31 */            ILogger logger = sentryAndroidOptions.getLogger();
/* 35 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 53 */            logger.mo4672k(enumC1553m5, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f9785c.isEnableUncaughtExceptionHandler()));
/* 62 */            if (this.f9785c.isEnableUncaughtExceptionHandler()) {
/* 64 */                C1702a c1702a = f9782e;
/* 66 */                c1702a.m5443c();
                        try {
/* 69 */                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
/* 73 */                    if (defaultUncaughtExceptionHandler != null) {
/* 108 */                       this.f9785c.getLogger().mo4672k(enumC1553m5, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
/* 113 */                       if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (c1469h4 = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f9784b) == null) {
/* 134 */                           this.f9783a = defaultUncaughtExceptionHandler;
                                } else {
/* 122 */                           InterfaceC1424d1 interfaceC1424d1 = AbstractC1552m4.f11138a;
/* 124 */                           c1469h4.getClass();
/* 129 */                           this.f9783a = uncaughtExceptionHandlerIntegration.f9783a;
                                }
                            }
/* 139 */                   Thread.setDefaultUncaughtExceptionHandler(this);
/* 142 */                   c1702a.close();
/* 155 */                   this.f9785c.getLogger().mo4672k(enumC1553m5, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
/* 160 */                   AbstractC1704c.m5446a("UncaughtExceptionHandler");
                        } catch (Throwable th) {
                            try {
/* 164 */                       c1702a.close();
                            } catch (Throwable th2) {
/* 169 */                       th.addSuppressed(th2);
                            }
/* 172 */                   throw th;
                        }
                    }
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C1626w c1626w;
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9785c;
/* 3 */             if (sentryAndroidOptions == null || this.f9784b == null) {
/* 194 */               return;
                    }
/* 20 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Uncaught exception received.", new Object[0]);
                    try {
/* 37 */                C1540l7 c1540l7 = new C1540l7(this.f9785c.getFlushTimeoutMillis(), this.f9785c.getLogger());
/* 42 */                C1615o c1615o = new C1615o();
/* 47 */                c1615o.f11414d = Boolean.FALSE;
/* 51 */                c1615o.f11411a = "UncaughtExceptionHandler";
/* 60 */                C1393c5 c1393c5 = new C1393c5(new C1440a(c1615o, th, thread, false));
/* 65 */                c1393c5.f10787f0 = EnumC1553m5.FATAL;
/* 73 */                if (this.f9784b.mo5093m() == null && (c1626w = c1393c5.f11516a) != null) {
/* 79 */                    c1540l7.mo4959g(c1626w);
                        }
/* 85 */                C1486i0 c1486i0M5450e = AbstractC1704c.m5450e(c1540l7);
/* 97 */                boolean zEquals = this.f9784b.mo5080B(c1393c5, c1486i0M5450e).equals(C1626w.f11478b);
/* 109 */               EnumC1477e enumC1477e = (EnumC1477e) c1486i0M5450e.m5274c(EnumC1477e.class, "sentry:eventDropReason");
/* 111 */               if ((!zEquals || EnumC1477e.MULTITHREADED_DEDUPLICATION.equals(enumC1477e)) && !c1540l7.mo4955d()) {
/* 143 */                   this.f9785c.getLogger().mo4672k(EnumC1553m5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c1393c5.f11516a);
                        }
                    } catch (Throwable th2) {
/* 157 */               this.f9785c.getLogger().mo4671d(EnumC1553m5.ERROR, "Error sending uncaught exception to Sentry.", th2);
                    }
/* 160 */           Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9783a;
/* 162 */           SentryAndroidOptions sentryAndroidOptions2 = this.f9785c;
/* 164 */           if (uncaughtExceptionHandler != null) {
/* 176 */               sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
/* 181 */               this.f9783a.uncaughtException(thread, th);
                    } else if (sentryAndroidOptions2.isPrintUncaughtStackTrace()) {
/* 191 */               th.printStackTrace();
                    }
                }
            }
