            package com.appsflyer.internal;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class AFh1gSDK extends AFh1mSDK {
                public final AFe1pSDK hashCode;

                public AFh1gSDK(String str, byte[] bArr, String str2, AFe1pSDK aFe1pSDK, Map<String, String> map) {
/* 4 */             super(null, str, Boolean.FALSE);
/* 7 */             this.component3 = str2;
/* 9 */             getMediationNetwork(bArr);
/* 12 */            this.hashCode = aFe1pSDK;
/* 14 */            if (map != null) {
/* 18 */                this.getMediationNetwork.putAll(map);
                    }
                }

                @Override // com.appsflyer.internal.AFh1mSDK
                public final AFe1pSDK AFAdRevenueData() {
/* 1 */             AFe1pSDK aFe1pSDK = this.hashCode;
                    return aFe1pSDK != null ? aFe1pSDK : AFe1pSDK.CACHED_EVENT;
                }

                @Deprecated
/* 21 */        public AFh1gSDK() {
/* 23 */            this.hashCode = null;
                }
            }
