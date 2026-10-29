            package com.appsflyer.internal;

            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AFe1wSDK<Body> implements ResponseNetwork<Body> {
                final Map<String, List<String>> AFAdRevenueData;
                final int getCurrencyIso4217Code;
                private final Body getMediationNetwork;
                public final AFd1aSDK getMonetizationNetwork;
                final boolean getRevenue;

                public AFe1wSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFd1aSDK aFd1aSDK) {
/* 4 */             this.getMediationNetwork = body;
/* 6 */             this.getCurrencyIso4217Code = i;
/* 8 */             this.getRevenue = z;
/* 15 */            this.AFAdRevenueData = new HashMap(map);
/* 17 */            this.getMonetizationNetwork = aFd1aSDK;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            AFe1wSDK aFe1wSDK = (AFe1wSDK) obj;
/* 25 */            if (this.getCurrencyIso4217Code == aFe1wSDK.getCurrencyIso4217Code && this.getRevenue == aFe1wSDK.getRevenue && this.getMediationNetwork.equals(aFe1wSDK.getMediationNetwork) && this.AFAdRevenueData.equals(aFe1wSDK.AFAdRevenueData)) {
/* 61 */                return this.getMonetizationNetwork.equals(aFe1wSDK.getMonetizationNetwork);
                    }
/* 5 */             return false;
                }

                @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
                public Body getBody() {
/* 1 */             return this.getMediationNetwork;
                }

                @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
                public List<String> getHeaderField(String str) {
/* 15 */            for (String str2 : this.AFAdRevenueData.keySet()) {
/* 23 */                if (str2 != null && str2.equalsIgnoreCase(str)) {
/* 33 */                    return this.AFAdRevenueData.get(str2);
                        }
                    }
/* 40 */            return null;
                }

                public final String getRevenue(String str) {
/* 1 */             List<String> headerField = getHeaderField(str);
/* 5 */             if (headerField == null || headerField.isEmpty()) {
/* 54 */                return null;
                    }
/* 13 */            Iterator<String> it = headerField.iterator();
/* 25 */            StringBuilder sb = new StringBuilder(it.next());
/* 32 */            while (it.hasNext()) {
/* 36 */                sb.append(", ");
/* 45 */                sb.append(it.next());
                    }
/* 49 */            return sb.toString();
                }

                @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
                public int getStatusCode() {
/* 1 */             return this.getCurrencyIso4217Code;
                }

                public int hashCode() {
/* 34 */            return this.getMonetizationNetwork.hashCode() + ((this.AFAdRevenueData.hashCode() + (((((this.getMediationNetwork.hashCode() * 31) + this.getCurrencyIso4217Code) * 31) + (this.getRevenue ? 1 : 0)) * 31)) * 31);
                }

                @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
                public boolean isSuccessful() {
/* 1 */             return this.getRevenue;
                }
            }
