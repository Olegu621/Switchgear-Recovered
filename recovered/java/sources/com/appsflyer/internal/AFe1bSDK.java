            package com.appsflyer.internal;

            import android.net.Uri;
            import com.appsflyer.AFLogger;
            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 104 */   public final class AFe1bSDK extends AFe1mSDK<Boolean> {
                private static volatile boolean component4;
                private final AFc1tSDK areAllFieldsValid;
                private Boolean component1;
                private final AFd1zSDK component2;
                private final AFe1oSDK component3;

                public AFe1bSDK(AFd1zSDK aFd1zSDK) {
/* 8 */             super(AFe1pSDK.LOAD_CACHE, new AFe1pSDK[0], "LoadCachedRequests");
/* 15 */            this.areAllFieldsValid = aFd1zSDK.registerClient();
/* 21 */            this.component3 = aFd1zSDK.copydefault();
/* 23 */            this.component2 = aFd1zSDK;
                }

                public static boolean component3() {
/* 1 */             return component4;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final long AFAdRevenueData() {
/* 1 */             return 30000L;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() throws Exception {
/* 15 */            for (AFc1uSDK aFc1uSDK : this.areAllFieldsValid.getCurrencyIso4217Code()) {
/* 23 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 25 */                AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
/* 31 */                StringBuilder sb = new StringBuilder("resending request: ");
/* 36 */                sb.append(aFc1uSDK.getRevenue);
/* 43 */                aFLogger.m1815i(aFg1cSDK, sb.toString());
                        try {
/* 62 */                    AFh1gSDK aFh1gSDK = new AFh1gSDK(getRevenue(aFc1uSDK), aFc1uSDK.getMediationNetwork(), aFc1uSDK.getMediationNetwork, aFc1uSDK.AFAdRevenueData, aFc1uSDK.getMonetizationNetwork);
/* 65 */                    AFe1oSDK aFe1oSDK = this.component3;
/* 81 */                    aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new RunnableC02601(new AFf1uSDK(aFh1gSDK, this.component2)));
                        } catch (Exception e) {
/* 92 */                    AFLogger.INSTANCE.m1811e(AFg1cSDK.QUEUE, "Failed to resend cached request", e);
                        }
                    }
/* 98 */            this.component1 = Boolean.TRUE;
/* 101 */           component4 = true;
/* 103 */           return AFe1uSDK.SUCCESS;
                }

/* 105 */       private static String getRevenue(AFc1uSDK aFc1uSDK) {
/* 106 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 108 */           long j = Long.parseLong(aFc1uSDK.getMediationNetwork, 10);
/* 109 */           String str = aFc1uSDK.getRevenue;
                    try {
/* 113 */               return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j) / 1000)).toString();
                    } catch (Exception e) {
/* 114 */               AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
                        return str;
                    }
                }
            }
