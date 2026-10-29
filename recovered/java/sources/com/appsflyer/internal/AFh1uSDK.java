            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1uSDK implements AFg1bSDK {
                private final AFd1zSDK AFAdRevenueData;
                private AFg1hSDK getCurrencyIso4217Code;
                private AFh1zSDK getMediationNetwork;
                private AFh1wSDK getRevenue;

                public AFh1uSDK(AFd1zSDK aFd1zSDK) {
/* 1 */             aFd1zSDK.getClass();
/* 7 */             this.AFAdRevenueData = aFd1zSDK;
                }

                @Override // com.appsflyer.internal.AFg1bSDK
                public final void AFAdRevenueData() {
/* 1 */             AFh1zSDK aFh1zSDK = this.getMediationNetwork;
/* 3 */             if (aFh1zSDK != null) {
/* 5 */                 AFLogger aFLogger = AFLogger.INSTANCE;
/* 14 */                AFh1ySDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
/* 23 */                aFLogger.unregisterClient(aFh1zSDK);
/* 27 */                this.getMediationNetwork = null;
                    }
                }

                @Override // com.appsflyer.internal.AFg1bSDK
                public final void areAllFieldsValid() {
/* 1 */             AFLogger aFLogger = AFLogger.INSTANCE;
/* 5 */             if (this.getCurrencyIso4217Code == null) {
/* 12 */                this.getCurrencyIso4217Code = new AFg1hSDK();
                    }
/* 14 */            AFg1hSDK aFg1hSDK = this.getCurrencyIso4217Code;
/* 16 */            aFg1hSDK.getClass();
/* 25 */            aFLogger.registerClient(aFg1hSDK);
                }

                @Override // com.appsflyer.internal.AFg1bSDK
                public final void getCurrencyIso4217Code() {
/* 1 */             AFh1wSDK aFh1wSDK = this.getRevenue;
/* 3 */             if (aFh1wSDK != null) {
/* 5 */                 AFLogger aFLogger = AFLogger.INSTANCE;
/* 14 */                AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
/* 23 */                aFLogger.unregisterClient(aFh1wSDK);
/* 27 */                this.getRevenue = null;
                    }
                }

                @Override // com.appsflyer.internal.AFg1bSDK
                public final void getMediationNetwork() {
/* 1 */             AFLogger aFLogger = AFLogger.INSTANCE;
/* 5 */             if (this.getMediationNetwork == null) {
/* 14 */                this.getMediationNetwork = new AFh1zSDK(this.AFAdRevenueData);
                    }
/* 16 */            AFh1zSDK aFh1zSDK = this.getMediationNetwork;
/* 18 */            aFh1zSDK.getClass();
/* 27 */            aFLogger.registerClient(aFh1zSDK);
                }

                @Override // com.appsflyer.internal.AFg1bSDK
                public final void getMonetizationNetwork() {
/* 1 */             AFg1hSDK aFg1hSDK = this.getCurrencyIso4217Code;
/* 3 */             if (aFg1hSDK != null) {
/* 5 */                 AFLogger aFLogger = AFLogger.INSTANCE;
/* 14 */                AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
/* 23 */                aFLogger.unregisterClient(aFg1hSDK);
/* 27 */                this.getCurrencyIso4217Code = null;
                    }
                }

                @Override // com.appsflyer.internal.AFg1bSDK
                public final void getRevenue() {
/* 1 */             AFLogger aFLogger = AFLogger.INSTANCE;
/* 5 */             if (this.getRevenue == null) {
/* 14 */                this.getRevenue = new AFh1wSDK(this.AFAdRevenueData);
                    }
/* 16 */            AFh1wSDK aFh1wSDK = this.getRevenue;
/* 18 */            aFh1wSDK.getClass();
/* 27 */            aFLogger.registerClient(aFh1wSDK);
                }
            }
