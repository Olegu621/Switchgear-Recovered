            package io.sentry.logger;

            import io.sentry.C1422d;
            import io.sentry.C1575o5;
            import io.sentry.EnumC1636q5;
            import io.sentry.android.core.SentryAndroidOptions;
            import p000.u93;
            
            /* JADX INFO: renamed from: io.sentry.logger.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1546f implements InterfaceC1541a, InterfaceC1542b, InterfaceC1543c {

                /* JADX INFO: renamed from: a */
                public static final C1546f f11132a = new C1546f();

                /* JADX INFO: renamed from: b */
                public static final C1546f f11133b = new C1546f();

                @Override // io.sentry.logger.InterfaceC1542b
                /* JADX INFO: renamed from: a */
                public void mo4871a(boolean z) {
                }

                @Override // io.sentry.logger.InterfaceC1542b
                /* JADX INFO: renamed from: b */
                public void mo5345b(long j) {
                }

                @Override // io.sentry.logger.InterfaceC1543c
                /* JADX INFO: renamed from: c */
                public InterfaceC1542b mo4942c(SentryAndroidOptions sentryAndroidOptions, u93 u93Var) {
/* 3 */             return new C1545e(sentryAndroidOptions, u93Var);
                }

                @Override // io.sentry.logger.InterfaceC1542b
                /* JADX INFO: renamed from: d */
                public void mo5346d(C1575o5 c1575o5) {
                }

                @Override // io.sentry.logger.InterfaceC1541a
                /* JADX INFO: renamed from: e */
                public void mo5212e(EnumC1636q5 enumC1636q5, C1422d c1422d, String str, Object... objArr) {
                }
            }
