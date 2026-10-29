            package io.sentry.android.core;

            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.cache.C1180b;
            import io.sentry.util.C1709h;
            import io.sentry.util.InterfaceC1707f;
            import java.io.File;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.android.core.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final /* synthetic */ class C1250p implements InterfaceC1707f {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10234a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SentryAndroidOptions f10235b;

                public /* synthetic */ C1250p(C1709h c1709h, SentryAndroidOptions sentryAndroidOptions) {
/* 2 */             this.f10234a = 4;
/* 7 */             this.f10235b = sentryAndroidOptions;
                }

                @Override // io.sentry.util.InterfaceC1707f
                /* JADX INFO: renamed from: b */
                public Object mo4803b() {
/* 1 */             int i = this.f10234a;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = this.f10235b;
                    switch (i) {
                        case 0:
/* 104 */                   return sentryAndroidOptions.getExecutorService();
                        case 1:
/* 24 */                    List list = C1180b.f9982V;
/* 26 */                    String outboxPath = sentryAndroidOptions.getOutboxPath();
/* 30 */                    boolean z = false;
/* 31 */                    if (outboxPath != null) {
/* 51 */                        File file = new File(outboxPath, "startup_crash");
                                try {
/* 54 */                            boolean zExists = file.exists();
/* 58 */                            if (zExists && !file.delete()) {
/* 82 */                                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                                    }
/* 85 */                            z = zExists;
                                } catch (Throwable th) {
/* 96 */                            sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
                                }
                                break;
                            } else {
/* 43 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                            }
/* 99 */                    return Boolean.valueOf(z);
                        case 2:
                        default:
/* 14 */                    return Boolean.valueOf(C1709h.m5473b(sentryAndroidOptions, "androidx.core.view.ScrollingView"));
                        case 3:
/* 19 */                    return sentryAndroidOptions.getExecutorService();
                    }
                }

/* 9 */         public /* synthetic */ C1250p(SentryAndroidOptions sentryAndroidOptions, int i) {
/* 10 */            this.f10234a = i;
                    this.f10235b = sentryAndroidOptions;
                }
            }
