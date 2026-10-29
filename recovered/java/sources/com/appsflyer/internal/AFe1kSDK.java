            package com.appsflyer.internal;

            import com.appsflyer.PurchaseHandler;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFe1kSDK extends AFe1hSDK {
                public AFe1kSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1zSDK aFd1zSDK) {
/* 15 */            super(AFe1pSDK.ARS_VALIDATE, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
/* 22 */            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
                }

                @Override // com.appsflyer.internal.AFe1hSDK, com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 3 */             if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
/* 15 */                return super.getMonetizationNetwork();
                    }
/* 13 */            return true;
                }

                @Override // com.appsflyer.internal.AFe1jSDK
                public final AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
/* 3 */             return ((AFe1fSDK) this).component4.AFAdRevenueData(map, str, str2);
                }
            }
