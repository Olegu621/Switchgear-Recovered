            package com.appsflyer.internal;

            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFa1tSDK implements Runnable {
                private final AFh1mSDK getCurrencyIso4217Code;
                private final AFd1zSDK getMonetizationNetwork;
                private final Map<String, Object> getRevenue;

                public AFa1tSDK(AFd1zSDK aFd1zSDK, AFh1mSDK aFh1mSDK, Map<String, ? extends Object> map) {
/* 1 */             aFd1zSDK.getClass();
/* 4 */             aFh1mSDK.getClass();
/* 10 */            this.getMonetizationNetwork = aFd1zSDK;
/* 12 */            this.getCurrencyIso4217Code = aFh1mSDK;
/* 14 */            this.getRevenue = map;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AFe1mSDK aFf1tSDK;
/* 7 */             if (this.getCurrencyIso4217Code.getRevenue()) {
/* 15 */                AFf1rSDK aFf1rSDK = new AFf1rSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork);
/* 20 */                aFf1rSDK.hashCode = this.getRevenue;
                        aFf1tSDK = aFf1rSDK;
                    } else {
/* 47 */                aFf1tSDK = this.getCurrencyIso4217Code instanceof AFh1lSDK ? new AFf1tSDK((AFh1lSDK) this.getCurrencyIso4217Code, this.getMonetizationNetwork) : new AFf1sSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork);
                    }
/* 52 */            AFe1oSDK aFe1oSDKCopydefault = this.getMonetizationNetwork.copydefault();
/* 63 */            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(aFf1tSDK));
/* 68 */            this.getMonetizationNetwork.AFKeystoreWrapper();
/* 75 */            if (AFe1vSDK.getMediationNetwork()) {
/* 79 */                AFe1sSDK currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
/* 83 */                AFh1mSDK aFh1mSDK = this.getCurrencyIso4217Code;
/* 85 */                aFh1mSDK.getClass();
/* 96 */                if (AFj1kSDK.getRevenue(currencyIso4217Code.AFAdRevenueData.getMonetizationNetwork)) {
/* 98 */                    AFe1rSDK.Companion companion = AFe1rSDK.INSTANCE;
/* 100 */                   AFe1rSDK mediationNetwork = AFe1rSDK.Companion.getMediationNetwork(aFh1mSDK);
/* 104 */                   if (mediationNetwork == null) {
/* 112 */                       return;
                            }
/* 109 */                   currencyIso4217Code.AFAdRevenueData(mediationNetwork, AFe1sSDK.C02654.getCurrencyIso4217Code);
                        }
                    }
                }
            }
