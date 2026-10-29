            package com.appsflyer.internal;

            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1aSDK {
                public final int getCurrencyIso4217Code;
                public final int getMediationNetwork;
                public final long getMonetizationNetwork;
                public final String getRevenue;

                public AFh1aSDK(String str, int i, int i2, long j) {
/* 4 */             this.getRevenue = str;
/* 6 */             this.getCurrencyIso4217Code = i;
/* 8 */             this.getMediationNetwork = i2;
/* 10 */            this.getMonetizationNetwork = j;
                }

                public final String AFAdRevenueData() {
/* 3 */             JSONObject jSONObject = new JSONObject();
                    try {
/* 10 */                jSONObject.put("sdk_ver", this.getRevenue);
/* 17 */                jSONObject.put("min", this.getCurrencyIso4217Code);
/* 24 */                jSONObject.put("expire", this.getMediationNetwork);
/* 31 */                jSONObject.put("ttl", this.getMonetizationNetwork);
                    } catch (JSONException unused) {
                    }
/* 34 */            return jSONObject.toString();
                }

                public final boolean equals(Object obj) {
                    String str;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && AFh1aSDK.class == obj.getClass()) {
/* 17 */                AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
/* 23 */                if (this.getCurrencyIso4217Code == aFh1aSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFh1aSDK.getMediationNetwork && this.getMonetizationNetwork == aFh1aSDK.getMonetizationNetwork && (str = this.getRevenue) != null && str.equals(aFh1aSDK.getRevenue)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.getRevenue;
/* 26 */            return ((((((str != null ? str.hashCode() : 0) * 31) + this.getCurrencyIso4217Code) * 31) + this.getMediationNetwork) * 31) + ((int) this.getMonetizationNetwork);
                }
            }
