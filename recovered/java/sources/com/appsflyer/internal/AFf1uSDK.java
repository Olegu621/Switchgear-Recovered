            package com.appsflyer.internal;

            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.net.MalformedURLException;
            import java.net.URL;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1uSDK extends AFe1fSDK<String> {
                private final AFh1gSDK component2;

                public AFf1uSDK(AFh1gSDK aFh1gSDK, AFd1zSDK aFd1zSDK) {
/* 1 */             AFe1pSDK aFe1pSDK = aFh1gSDK.hashCode;
/* 7 */             AFe1pSDK aFe1pSDK2 = aFe1pSDK == null ? AFe1pSDK.CACHED_EVENT : aFe1pSDK;
/* 12 */            AFe1pSDK[] aFe1pSDKArr = {AFe1pSDK.RC_CDN};
/* 18 */            StringBuilder sb = new StringBuilder();
/* 23 */            sb.append(aFh1gSDK.component3);
/* 28 */            sb.append("-");
/* 35 */            sb.append(getRevenue(aFh1gSDK));
/* 46 */            super(aFe1pSDK2, aFe1pSDKArr, aFd1zSDK, sb.toString(), aFh1gSDK.component3);
/* 49 */            this.component2 = aFh1gSDK;
                }

                private boolean copy() {
/* 1 */             ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 23 */            boolean z = this.getMonetizationNetwork == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
/* 24 */            AFe1pSDK aFe1pSDK = this.getRevenue;
                    return z && (aFe1pSDK == AFe1pSDK.CONVERSION || aFe1pSDK == AFe1pSDK.ATTR);
                }

                private boolean equals() {
                    ResponseNetwork responseNetwork;
/* 3 */             AFe1pSDK aFe1pSDK = this.component2.hashCode;
/* 5 */             if (aFe1pSDK == null) {
/* 8 */                 aFe1pSDK = AFe1pSDK.CACHED_EVENT;
                    }
                    return aFe1pSDK == AFe1pSDK.ARS_VALIDATE && (responseNetwork = ((AFe1fSDK) this).areAllFieldsValid) != null && responseNetwork.getStatusCode() == 424;
                }

                private static String getRevenue(AFh1gSDK aFh1gSDK) {
                    try {
/* 8 */                 return new URL(aFh1gSDK.component2).getHost();
                    } catch (MalformedURLException unused) {
/* 13 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<String> AFAdRevenueData(String str) {
/* 8 */             String strEncodeToString = Base64.encodeToString(this.component2.getMonetizationNetwork(), 2);
/* 22 */            AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
/* 31 */            this.component3.getRevenue(this.component2.component2, strEncodeToString);
/* 38 */            return ((AFe1fSDK) this).component4.getRevenue(this.component2);
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 3 */             return this.component2.getCurrencyIso4217Code;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
                    return super.getMonetizationNetwork() || equals() || copy();
                }
            }
