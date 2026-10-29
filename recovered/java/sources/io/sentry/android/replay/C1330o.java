            package io.sentry.android.replay;

            import io.sentry.ThreadFactoryC1524k0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.util.ScheduledExecutorServiceC1353g;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1330o extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10566a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReplayIntegration f10567b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1330o(ReplayIntegration replayIntegration, int i) {
/* 6 */             super(0);
/* 1 */             this.f10566a = i;
/* 3 */             this.f10567b = replayIntegration;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f10566a;
/* 6 */             ReplayIntegration replayIntegration = this.f10567b;
                    switch (i) {
                        case 0:
/* 44 */                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1524k0(3));
/* 50 */                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
/* 53 */                    SentryAndroidOptions sentryAndroidOptions = replayIntegration.f10421d;
/* 55 */                    if (sentryAndroidOptions != null) {
/* 57 */                        return new ScheduledExecutorServiceC1353g(scheduledExecutorServiceNewSingleThreadScheduledExecutor, sentryAndroidOptions);
                            }
/* 61 */                    Intrinsics.m6220e("options");
/* 64 */                    throw null;
                        default:
/* 17 */                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor2 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1524k0(2));
/* 23 */                    scheduledExecutorServiceNewSingleThreadScheduledExecutor2.getClass();
/* 26 */                    SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.f10421d;
/* 28 */                    if (sentryAndroidOptions2 != null) {
/* 30 */                        return new ScheduledExecutorServiceC1353g(scheduledExecutorServiceNewSingleThreadScheduledExecutor2, sentryAndroidOptions2);
                            }
/* 34 */                    Intrinsics.m6220e("options");
/* 37 */                    throw null;
                    }
                }
            }
