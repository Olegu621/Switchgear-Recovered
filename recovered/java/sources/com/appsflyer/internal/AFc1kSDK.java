            package com.appsflyer.internal;

            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.SynchronousQueue;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFc1kSDK {
                private static final p51 getMediationNetwork = r51.m8065b(C02475.getMediationNetwork);

                /* JADX INFO: renamed from: com.appsflyer.internal.AFc1kSDK$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02475 extends b51 implements Function0<ExecutorService> {
                    public static final C02475 getMediationNetwork = new C02475();

                    public C02475() {
/* 2 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public final ExecutorService invoke() {
/* 1 */                 return Executors.newSingleThreadExecutor();
                    }
                }

                public static final ExecutorService getCurrencyIso4217Code() {
/* 18 */            AFc1jSDK aFc1jSDK = new AFc1jSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
/* 21 */            aFc1jSDK.allowCoreThreadTimeOut(true);
/* 24 */            return aFc1jSDK;
                }

                public static final ExecutorService getMediationNetwork() {
/* 3 */             Object value = getMediationNetwork.getValue();
/* 7 */             value.getClass();
/* 10 */            return (ExecutorService) value;
                }

                public static final ScheduledExecutorService getMonetizationNetwork() {
/* 2 */             ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
/* 6 */             scheduledExecutorServiceNewScheduledThreadPool.getClass();
/* 9 */             return scheduledExecutorServiceNewScheduledThreadPool;
                }

                public static final ScheduledExecutorService getRevenue() {
/* 1 */             ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
/* 5 */             scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
/* 8 */             return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                }
            }
