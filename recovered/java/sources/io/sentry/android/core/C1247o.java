            package io.sentry.android.core;

            import io.sentry.EnumC1553m5;
            import io.sentry.metrics.C1558c;
            
            /* JADX INFO: renamed from: io.sentry.android.core.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1247o extends C1558c implements InterfaceC1182d0 {
                @Override // io.sentry.metrics.C1558c, io.sentry.metrics.InterfaceC1556a
                /* JADX INFO: renamed from: a */
                public final void mo4894a(boolean z) {
/* 3 */             C1191g0.f10017e.m4791h(this);
/* 6 */             super.mo4894a(z);
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: c */
                public final void mo4761c() {
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: f */
                public final void mo4762f() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f11150a;
                    try {
/* 13 */                sentryAndroidOptions.getExecutorService().submit(new RunnableC1238l(this, 1));
                    } catch (Throwable th) {
/* 29 */                sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
                    }
                }
            }
