            package com.appsflyer.internal;

            import android.content.Intent;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface AFh1pSDK {
                void AFAdRevenueData();

                void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK);

                void getMediationNetwork(AFh1mSDK aFh1mSDK);

                void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0);

                void getMonetizationNetwork(AFh1mSDK aFh1mSDK);

                boolean getMonetizationNetwork();

                boolean getRevenue();

                /* JADX INFO: renamed from: u_ */
                void mo1809u_(Intent intent, AFa1mSDK aFa1mSDK);
            }
