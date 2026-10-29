            package com.appsflyer.internal;

            import com.appsflyer.AFAdRevenueData;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1lSDK extends AFh1mSDK {
                public final Map<String, Object> equals;
                public final AFAdRevenueData toString;

                public AFh1lSDK(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
/* 6 */             super("adrevenue_generic", null, Boolean.TRUE);
/* 9 */             this.toString = aFAdRevenueData;
/* 11 */            this.equals = map;
                }

                @Override // com.appsflyer.internal.AFh1mSDK
                public final AFe1pSDK AFAdRevenueData() {
/* 1 */             return AFe1pSDK.ADREVENUE;
                }
            }
