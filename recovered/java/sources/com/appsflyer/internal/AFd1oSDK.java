            package com.appsflyer.internal;

            import android.content.pm.PackageManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface AFd1oSDK {
                void AFAdRevenueData(String str, int i, String str2);

                boolean AFAdRevenueData();

                boolean areAllFieldsValid();

                void getCurrencyIso4217Code();

                void getMediationNetwork();

                void getMonetizationNetwork();

                void getMonetizationNetwork(String str, String str2);

                void getRevenue();

                void getRevenue(String str, String str2);

                void getRevenue(String str, String... strArr);

                void getRevenue(Throwable th);

                /* JADX INFO: renamed from: q_ */
                void mo1790q_(String str, PackageManager packageManager);
            }
