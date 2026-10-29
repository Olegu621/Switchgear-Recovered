            package com.appsflyer.internal;

            import com.appsflyer.AFAdRevenueData;
            import com.appsflyer.AdRevenueScheme;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import p000.C2085pw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1tSDK extends AFf1sSDK {
                private final AFh1lSDK copydefault;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFf1tSDK(AFh1lSDK aFh1lSDK, AFd1zSDK aFd1zSDK) {
/* 7 */             super(aFh1lSDK, aFd1zSDK);
/* 1 */             aFh1lSDK.getClass();
/* 4 */             aFd1zSDK.getClass();
/* 10 */            this.copydefault = aFh1lSDK;
                }

                @Override // com.appsflyer.internal.AFf1sSDK
                public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
/* 1 */             aFh1mSDK.getClass();
/* 4 */             super.AFAdRevenueData(aFh1mSDK);
/* 9 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 14 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 19 */            AFAdRevenueData aFAdRevenueData = this.copydefault.toString;
/* 21 */            aFAdRevenueData.getClass();
/* 30 */            linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
/* 39 */            linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
/* 52 */            linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
/* 65 */            linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
/* 70 */            Map<String, Object> map = this.copydefault.equals;
/* 72 */            if (map != null && !map.isEmpty()) {
/* 93 */                List listM7566e = C2085pw.m7566e(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT);
/* 109 */               for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 117 */                   String key = entry.getKey();
/* 123 */                   Object value = entry.getValue();
/* 131 */                   if (listM7566e.contains(key)) {
/* 133 */                       linkedHashMap.put(key, value);
                            } else {
/* 137 */                       linkedHashMap2.put(key, value);
                            }
                        }
/* 143 */               linkedHashMap.put("custom_parameters", linkedHashMap2);
                    }
/* 148 */           LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 155 */           linkedHashMap3.put("name", "adrevenue_sdk");
/* 160 */           linkedHashMap3.put("payload", linkedHashMap);
/* 163 */           Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
/* 165 */           map2.getClass();
/* 170 */           map2.put("ad_network", linkedHashMap3);
                }
            }
