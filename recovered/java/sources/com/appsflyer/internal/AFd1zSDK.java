            package com.appsflyer.internal;

            import com.appsflyer.PurchaseHandler;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ScheduledExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface AFd1zSDK {
                AFc1oSDK AFAdRevenueData();

                AFc1hSDK AFInAppEventParameterName();

                AFf1eSDK AFInAppEventType();

                AFe1vSDK AFKeystoreWrapper();

                AFj1sSDK AFLogger();

                AFf1fSDK afDebugLog();

                AFi1hSDK afErrorLog();

                AFd1xSDK afErrorLogForExcManagerOnly();

                AFg1bSDK afInfoLog();

                AFb1hSDK afLogForce();

                AFa1lSDK afVerboseLog();

                AFh1pSDK afWarnLog();

                AFh1xSDK areAllFieldsValid();

                AFf1kSDK component1();

                PurchaseHandler component2();

                AFg1nSDK component3();

                AFc1qSDK component4();

                AFd1oSDK copy();

                AFe1oSDK copydefault();

                /* JADX INFO: renamed from: d */
                AFi1pSDK mo1779d();

                /* JADX INFO: renamed from: e */
                AFa1cSDK mo1780e();

                AFj1lSDK equals();

                AFc1eSDK force();

                AFe1sSDK getCurrencyIso4217Code();

                ScheduledExecutorService getMediationNetwork();

                ExecutorService getMonetizationNetwork();

                AFd1nSDK getRevenue();

                /* JADX INFO: renamed from: i */
                AFa1mSDK mo1781i();

                AFc1tSDK registerClient();

                AFi1kSDK unregisterClient();

                /* JADX INFO: renamed from: v */
                AFb1aSDK mo1782v();

                /* JADX INFO: renamed from: w */
                AFi1oSDK mo1783w();
            }
