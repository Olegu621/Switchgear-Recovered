            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.Map;
            import org.json.JSONObject;
            import p000.od0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFa1gSDK implements AFa1lSDK {
                private final AFc1qSDK getRevenue;

                public AFa1gSDK(AFc1qSDK aFc1qSDK) {
/* 1 */             aFc1qSDK.getClass();
/* 7 */             this.getRevenue = aFc1qSDK;
                }

                @Override // com.appsflyer.internal.AFa1lSDK
                public final void AFAdRevenueData() {
/* 5 */             this.getRevenue.AFAdRevenueData("deeplink_data");
                }

                @Override // com.appsflyer.internal.AFa1lSDK
                public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
/* 1 */             map.getClass();
/* 17 */            this.getRevenue.getRevenue("deeplink_data", new JSONObject(map).toString());
                }

                @Override // com.appsflyer.internal.AFa1lSDK
                public final Map<String, Object> getRevenue() {
/* 9 */             if (this.getRevenue.getMonetizationNetwork("deeplink_data")) {
                        try {
/* 14 */                    String monetizationNetwork = this.getRevenue.getMonetizationNetwork("deeplink_data", (String) null);
/* 18 */                    if (monetizationNetwork != null) {
/* 31 */                        return AFj1bSDK.getMonetizationNetwork(new JSONObject(monetizationNetwork));
                            }
/* 20 */                    od0 od0Var = od0.f14715a;
/* 22 */                    od0Var.getClass();
/* 25 */                    return od0Var;
                        } catch (Throwable th) {
/* 41 */                    AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
                        }
                    }
/* 44 */            od0 od0Var2 = od0.f14715a;
/* 46 */            od0Var2.getClass();
/* 49 */            return od0Var2;
                }
            }
