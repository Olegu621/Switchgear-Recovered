            package com.appsflyer.internal;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AFLogger;
            import com.appsflyer.deeplink.DeepLinkResult;
            import java.util.Collections;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class AFh1xSDK {
                public long copydefault;
                public final AFc1oSDK getCurrencyIso4217Code;
                public final AFc1qSDK getMonetizationNetwork;
                public final Map<String, Object> AFAdRevenueData = new ConcurrentHashMap();
                public final Map<String, Object> getMediationNetwork = new ConcurrentHashMap();
                public final Map<String, Object> getRevenue = new ConcurrentHashMap();
                public long areAllFieldsValid = 0;
                public long component4 = 0;
                public final long[] component3 = new long[2];
                public final long[] component2 = new long[2];
                public final long[] component1 = new long[2];
                public long copy = 0;
                public long toString = 0;

                public AFh1xSDK(AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK) {
/* 48 */            this.getMonetizationNetwork = aFc1qSDK;
/* 50 */            this.getCurrencyIso4217Code = aFc1oSDK;
                }

                public final boolean AFAdRevenueData() {
                    return this.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0;
                }

                public final Map<String, Object> getCurrencyIso4217Code(String str) {
/* 1 */             Map<String, Object> map = Collections.EMPTY_MAP;
/* 6 */             String monetizationNetwork = this.getMonetizationNetwork.getMonetizationNetwork(str, (String) null);
/* 10 */            if (monetizationNetwork != null) {
                        try {
/* 17 */                    return AFg1eSDK.getRevenue(new JSONObject(monetizationNetwork));
                        } catch (Exception e) {
/* 26 */                    AFLogger.afErrorLog("Error while parsing cached json data", e, true);
                        }
                    }
/* 29 */            return map;
                }

                public final void getMonetizationNetwork(int i) {
/* 1 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 5 */             long j = this.toString;
/* 11 */            if (j != 0) {
/* 22 */                this.getRevenue.put("net", Long.valueOf(jCurrentTimeMillis - j));
                    } else {
/* 28 */                AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
                    }
/* 39 */            this.getRevenue.put("retries", Integer.valueOf(i));
/* 57 */            this.getMonetizationNetwork.getRevenue("gcd", new JSONObject(this.getRevenue).toString());
                }

                public final void getRevenue(AFh1vSDK aFh1vSDK) {
/* 5 */             if (AFAdRevenueData()) {
/* 15 */                this.AFAdRevenueData.put("start_with", aFh1vSDK.toString());
/* 33 */                this.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(this.AFAdRevenueData).toString());
                    }
                }

/* 29 */        public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult, long j) {
/* 30 */            this.getMediationNetwork.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
/* 31 */            this.getMediationNetwork.put("timeout_value", Long.valueOf(j));
                }

/* 31 */        public final boolean getCurrencyIso4217Code() {
                    return this.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1;
                }

/* 60 */        public final void getMonetizationNetwork() {
/* 61 */            this.component4 = System.currentTimeMillis();
/* 62 */            if (AFAdRevenueData()) {
/* 63 */                long j = this.areAllFieldsValid;
                        if (j != 0) {
/* 64 */                    this.AFAdRevenueData.put("init_to_fg", Long.valueOf(this.component4 - j));
/* 67 */                    this.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(this.AFAdRevenueData).toString());
                            return;
                        }
/* 68 */                AFLogger.afInfoLog("Metrics: init ts is missing");
                    }
                }
            }
