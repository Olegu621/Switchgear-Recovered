            package com.appsflyer.internal;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFb1rSDK {
                public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
                public Map<String, Object> getMonetizationNetwork = new HashMap();

                public final void getCurrencyIso4217Code(Map<String, Object> map) {
/* 9 */             if (!this.getCurrencyIso4217Code.isEmpty()) {
/* 13 */                map.put("partner_data", this.getCurrencyIso4217Code);
                    }
/* 22 */            if (this.getMonetizationNetwork.isEmpty()) {
/* 40 */                return;
                    }
/* 30 */            AFa1ySDK.getMediationNetwork(map).put("partner_data", this.getMonetizationNetwork);
/* 38 */            this.getMonetizationNetwork = new HashMap();
                }
            }
