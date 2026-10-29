            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFi1vSDK {
                public final String AFAdRevenueData;
                private final boolean getCurrencyIso4217Code;
                public final String getMediationNetwork;
                public final AFi1zSDK getMonetizationNetwork;
                public final AFh1dSDK getRevenue;

                public AFi1vSDK(String str) throws JSONException {
/* 4 */             if (str == null) {
/* 83 */                throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
                    }
                    try {
/* 8 */                 JSONObject jSONObject = new JSONObject(str);
/* 13 */                String string = jSONObject.getString("ver");
/* 17 */                this.AFAdRevenueData = string;
/* 25 */                this.getCurrencyIso4217Code = jSONObject.optBoolean("test_mode");
/* 27 */                this.getMediationNetwork = str;
/* 42 */                this.getRevenue = string.startsWith("default") ? AFh1dSDK.DEFAULT : AFh1dSDK.CUSTOM;
/* 46 */                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
/* 59 */                this.getMonetizationNetwork = jSONObjectOptJSONObject != null ? new AFi1zSDK(jSONObjectOptJSONObject) : null;
                    } catch (JSONException e) {
/* 65 */                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
/* 75 */                throw new JSONException("Failed to parse remote configuration JSON");
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || AFi1vSDK.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            AFi1vSDK aFi1vSDK = (AFi1vSDK) obj;
/* 23 */            if (this.getCurrencyIso4217Code == aFi1vSDK.getCurrencyIso4217Code && this.AFAdRevenueData.equals(aFi1vSDK.AFAdRevenueData)) {
/* 41 */                return this.getMediationNetwork.equals(aFi1vSDK.getMediationNetwork);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 20 */            int iHashCode = this.getMediationNetwork.hashCode() + ((this.AFAdRevenueData.hashCode() + ((this.getCurrencyIso4217Code ? 1 : 0) * 31)) * 31);
/* 21 */            AFi1zSDK aFi1zSDK = this.getMonetizationNetwork;
/* 23 */            if (aFi1zSDK == null) {
/* 33 */                return iHashCode;
                    }
/* 31 */            return aFi1zSDK.hashCode() + (iHashCode * 31);
                }
            }
