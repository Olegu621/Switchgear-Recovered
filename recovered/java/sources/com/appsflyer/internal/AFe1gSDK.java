            package com.appsflyer.internal;

            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
            import com.appsflyer.share.LinkGenerator;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class AFe1gSDK extends AFe1fSDK<String> {
                private final String component2;
                private final String copy;
                private final UUID copydefault;
                private final Map<String, String> equals;
                private final LinkGenerator.ResponseListener hashCode;
                private final LinkGenerator toString;

                public AFe1gSDK(AFd1zSDK aFd1zSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
/* 13 */            super(AFe1pSDK.ONELINK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, uuid.toString());
/* 16 */            this.copydefault = uuid;
/* 18 */            this.component2 = str;
/* 25 */            this.equals = new HashMap(map);
/* 27 */            this.hashCode = responseListener;
/* 29 */            this.copy = str2;
/* 31 */            this.toString = linkGenerator;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<String> AFAdRevenueData(String str) {
/* 12 */            return ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2, this.equals, this.copy, this.copydefault, str);
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                /* JADX INFO: renamed from: a_ */
                public final boolean mo1797a_() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
                    ResponseNetwork responseNetwork;
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             LinkGenerator.ResponseListener responseListener = this.hashCode;
/* 6 */             if (responseListener != null) {
/* 12 */                if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS && (responseNetwork = ((AFe1fSDK) this).areAllFieldsValid) != null) {
/* 24 */                    responseListener.onResponse((String) responseNetwork.getBody());
/* 27 */                    return;
                        }
/* 28 */                Throwable thComponent1 = component1();
/* 34 */                if (!(thComponent1 instanceof ParsingException)) {
/* 70 */                    responseListener.onResponse(this.toString.generateLink());
                        } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
/* 50 */                    responseListener.onResponseError("Can't parse one link data");
                        } else {
/* 60 */                    responseListener.onResponse(this.toString.generateLink());
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
/* 16 */        public final long AFAdRevenueData() {
/* 17 */            return 3000L;
                }
            }
