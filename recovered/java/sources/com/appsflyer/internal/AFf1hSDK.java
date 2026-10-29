            package com.appsflyer.internal;

            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import java.nio.charset.Charset;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1hSDK {
                public final AFc1qSDK AFAdRevenueData;
                public long getMonetizationNetwork;
                public long getRevenue;
                public AFi1vSDK getMediationNetwork = null;
                public AFi1vSDK getCurrencyIso4217Code = getRevenue();

                public AFf1hSDK(AFc1qSDK aFc1qSDK) {
/* 7 */             this.AFAdRevenueData = aFc1qSDK;
/* 23 */            this.getRevenue = aFc1qSDK.getMonetizationNetwork("af_rc_timestamp", 0L);
/* 31 */            this.getMonetizationNetwork = aFc1qSDK.getMonetizationNetwork("af_rc_max_age", 0L);
                }

                private AFi1vSDK getRevenue() {
/* 6 */             String monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork("af_remote_config", (String) null);
/* 10 */            if (monetizationNetwork == null) {
/* 18 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.REMOTE_CONTROL, "No configuration found in cache");
/* 5 */                 return null;
                    }
                    try {
/* 38 */                return new AFi1vSDK(new String(Base64.decode(monetizationNetwork, 2), Charset.defaultCharset()));
                    } catch (Exception e) {
/* 50 */                AFLogger.INSTANCE.m1812e(AFg1cSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e, true);
/* 5 */                 return null;
                    }
                }
            }
