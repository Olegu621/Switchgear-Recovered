            package com.appsflyer.internal;

            import com.appsflyer.AFInAppEventType;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1cSDK extends AFh1fSDK {
                public AFh1cSDK() {
/* 5 */             super(AFInAppEventType.PURCHASE, Boolean.TRUE);
                }

                @Override // com.appsflyer.internal.AFh1mSDK
                public final AFe1pSDK AFAdRevenueData() {
/* 1 */             return AFe1pSDK.PURCHASE_VALIDATE;
                }
            }
