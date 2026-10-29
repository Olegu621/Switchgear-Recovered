            package com.appsflyer.internal;

            import com.appsflyer.PurchaseHandler;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public abstract class AFe1hSDK extends AFe1jSDK {
                private final PurchaseHandler.PurchaseValidationCallback component2;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFe1hSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
/* 19 */            super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null, map);
/* 1 */             aFe1pSDK.getClass();
/* 4 */             aFe1pSDKArr.getClass();
/* 7 */             aFd1zSDK.getClass();
/* 10 */            map.getClass();
/* 22 */            this.component2 = purchaseValidationCallback;
                }

                @Override // com.appsflyer.internal.AFe1jSDK
                public final boolean component3() {
/* 1 */             return true;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
                    PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
                    PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             Throwable thComponent1 = component1();
/* 8 */             if (thComponent1 != null && (purchaseValidationCallback2 = this.component2) != null) {
/* 14 */                purchaseValidationCallback2.onFailure(thComponent1);
                    }
/* 17 */            ResponseNetwork<String> responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 19 */            if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
/* 28 */                return;
                    }
/* 25 */            purchaseValidationCallback.onResponse(responseNetwork);
                }

                @Override // com.appsflyer.internal.AFe1jSDK
                public final String getMonetizationNetwork(Map<String, Object> map) {
/* 1 */             map.getClass();
/* 11 */            if (map.containsKey("connector_version")) {
/* 13 */                Object objRemove = map.remove("connector_version");
/* 19 */                if (objRemove instanceof String) {
/* 21 */                    return (String) objRemove;
                        }
                    }
/* 10 */            return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
/* 24 */        public boolean getMonetizationNetwork() {
/* 25 */            ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                    if (responseNetwork != null) {
/* 26 */                responseNetwork.getClass();
                        if (responseNetwork.getStatusCode() == 503) {
                            return true;
                        }
                    }
/* 27 */            return super.getMonetizationNetwork();
                }

                @Override // com.appsflyer.internal.AFe1jSDK
/* 28 */        public final String getCurrencyIso4217Code(Map<String, Object> map) {
                    map.getClass();
/* 29 */            if (map.containsKey("billing_library_version")) {
/* 30 */                Object objRemove = map.remove("billing_library_version");
                        if (objRemove instanceof String) {
                            return (String) objRemove;
                        }
                    }
                    return null;
                }
            }
