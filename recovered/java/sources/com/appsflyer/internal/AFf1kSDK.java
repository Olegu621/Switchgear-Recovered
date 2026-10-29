            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class AFf1kSDK implements AFe1qSDK {
                public final AFf1hSDK AFAdRevenueData;
                private final AFf1jSDK areAllFieldsValid;
                private final AFe1oSDK component1;
                private final AFd1nSDK component2;
                private AFf1pSDK component3;
                private AFi1wSDK component4;
                private final Object getCurrencyIso4217Code = new Object();
                private final AFf1nSDK getMediationNetwork;
                private final AFc1oSDK getMonetizationNetwork;
                private final AFf1eSDK getRevenue;

                public AFf1kSDK(AFf1nSDK aFf1nSDK, AFc1oSDK aFc1oSDK, AFf1eSDK aFf1eSDK, AFf1hSDK aFf1hSDK, AFd1nSDK aFd1nSDK, AFf1jSDK aFf1jSDK, AFe1oSDK aFe1oSDK) {
/* 11 */            this.getMediationNetwork = aFf1nSDK;
/* 13 */            this.getMonetizationNetwork = aFc1oSDK;
/* 15 */            this.getRevenue = aFf1eSDK;
/* 17 */            this.AFAdRevenueData = aFf1hSDK;
/* 19 */            this.component2 = aFd1nSDK;
/* 21 */            this.areAllFieldsValid = aFf1jSDK;
/* 23 */            this.component1 = aFe1oSDK;
/* 27 */            aFe1oSDK.getMediationNetwork.add(this);
                }

                public final void AFAdRevenueData(AFf1mSDK aFf1mSDK) {
/* 18 */            AFf1qSDK aFf1qSDK = new AFf1qSDK(this.getMediationNetwork, this.getMonetizationNetwork, this.getRevenue, this.AFAdRevenueData, this.component2, this.areAllFieldsValid, "v1", aFf1mSDK);
/* 21 */            AFe1oSDK aFe1oSDK = this.component1;
/* 30 */            aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new RunnableC02601(aFf1qSDK));
                }

                @Override // com.appsflyer.internal.AFe1qSDK
                public final void getCurrencyIso4217Code(AFe1mSDK<?> aFe1mSDK) {
/* 3 */             if (aFe1mSDK instanceof AFf1qSDK) {
/* 5 */                 AFf1qSDK aFf1qSDK = (AFf1qSDK) aFe1mSDK;
                        synchronized (this.getCurrencyIso4217Code) {
/* 11 */                    this.component4 = null;
                        }
/* 18 */                AFAdRevenueData(AFf1pSDK.FAILURE, aFf1qSDK.component2);
                    }
                }

                @Override // com.appsflyer.internal.AFe1qSDK
                public final void getRevenue(AFe1mSDK<?> aFe1mSDK, AFe1uSDK aFe1uSDK) {
/* 3 */             if (aFe1mSDK instanceof AFf1qSDK) {
/* 5 */                 AFf1qSDK aFf1qSDK = (AFf1qSDK) aFe1mSDK;
/* 7 */                 AFf1pSDK aFf1pSDK = aFf1qSDK.component3;
/* 9 */                 if (aFf1pSDK == null) {
/* 17 */                    AFLogger.INSTANCE.m1817w(AFg1cSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
/* 20 */                    aFf1pSDK = AFf1pSDK.FAILURE;
                        }
/* 24 */                if (aFf1pSDK != AFf1pSDK.USE_CACHED) {
/* 26 */                    AFi1wSDK aFi1wSDK = aFf1qSDK.areAllFieldsValid;
                            synchronized (this.getCurrencyIso4217Code) {
/* 31 */                        this.component4 = aFi1wSDK;
                            }
                        }
/* 40 */                AFAdRevenueData(aFf1pSDK, aFf1qSDK.component2);
                    }
                }

/* 25 */        public final AFi1wSDK getCurrencyIso4217Code() {
                    AFi1wSDK aFi1wSDK;
                    synchronized (this.getCurrencyIso4217Code) {
/* 27 */                aFi1wSDK = this.component4;
/* 28 */                this.component4 = null;
                    }
                    return aFi1wSDK;
                }

/* 33 */        private void AFAdRevenueData(AFf1pSDK aFf1pSDK, AFf1mSDK aFf1mSDK) {
                    synchronized (this.getCurrencyIso4217Code) {
/* 35 */                this.component3 = aFf1pSDK;
                    }
                    if (aFf1mSDK != null) {
/* 37 */                aFf1mSDK.onRemoteConfigUpdateFinished(aFf1pSDK);
                    }
                }
            }
