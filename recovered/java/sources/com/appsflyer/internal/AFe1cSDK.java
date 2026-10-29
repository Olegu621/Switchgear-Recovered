            package com.appsflyer.internal;

            import com.appsflyer.PurchaseHandler;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFe1cSDK extends AFe1hSDK {
                public AFe1cSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1zSDK aFd1zSDK) {
/* 15 */            super(AFe1pSDK.PURCHASE_VALIDATE, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
/* 22 */            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
                }

                @Override // com.appsflyer.internal.AFe1jSDK
                public final AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
/* 1 */             AFd1nSDK aFd1nSDK = ((AFe1fSDK) this).component4;
/* 21 */            return (AFd1hSDK) AFd1nSDK.getMediationNetwork(new Object[]{aFd1nSDK, map, str, str2}, -1130573825, 1130573827, System.identityHashCode(aFd1nSDK));
                }
            }
