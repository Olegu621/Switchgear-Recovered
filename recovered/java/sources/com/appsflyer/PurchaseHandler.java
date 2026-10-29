            package com.appsflyer;

            import com.appsflyer.internal.AFc1oSDK;
            import com.appsflyer.internal.AFd1zSDK;
            import com.appsflyer.internal.AFe1oSDK;
            import com.appsflyer.internal.AFj1dSDK;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PurchaseHandler {
                public final AFd1zSDK AFAdRevenueData;
                public final AFe1oSDK getCurrencyIso4217Code;
                private final AFc1oSDK getMonetizationNetwork;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface PurchaseValidationCallback {
                    void onFailure(Throwable th);

                    void onResponse(ResponseNetwork<String> responseNetwork);
                }

                public PurchaseHandler(AFd1zSDK aFd1zSDK) {
/* 4 */             this.AFAdRevenueData = aFd1zSDK;
/* 10 */            this.getMonetizationNetwork = aFd1zSDK.AFAdRevenueData();
/* 16 */            this.getCurrencyIso4217Code = aFd1zSDK.copydefault();
                }

                public final boolean getRevenue(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
/* 3 */             boolean currencyIso4217Code = AFj1dSDK.getCurrencyIso4217Code(map, strArr, this.getMonetizationNetwork);
/* 7 */             if (!currencyIso4217Code && purchaseValidationCallback != null) {
/* 18 */                purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
                    }
/* 21 */            return currencyIso4217Code;
                }
            }
