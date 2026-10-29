            package com.appsflyer.internal;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 26 */    public class AFd1bSDK {
                public final Map<String, String> AFAdRevenueData;
                private final boolean areAllFieldsValid;
                private final boolean component1;
                private boolean component2;
                private final byte[] component3;
                public int component4;
                public boolean getCurrencyIso4217Code;
                public final String getMediationNetwork;
                final String getMonetizationNetwork;
                public boolean getRevenue;

                private AFd1bSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
/* 5 */             this.component2 = true;
/* 8 */             this.getCurrencyIso4217Code = false;
/* 10 */            this.getRevenue = true;
/* 13 */            this.component4 = -1;
/* 15 */            this.getMediationNetwork = str;
/* 17 */            this.component3 = bArr;
/* 19 */            this.getMonetizationNetwork = str2;
/* 21 */            this.AFAdRevenueData = map;
/* 23 */            this.component1 = z;
/* 25 */            this.areAllFieldsValid = true;
                }

                public final boolean AFAdRevenueData() {
/* 1 */             return this.component2;
                }

                public final boolean component1() {
/* 1 */             return this.getRevenue;
                }

                public final boolean getCurrencyIso4217Code() {
/* 1 */             return this.getCurrencyIso4217Code;
                }

                public final boolean getMediationNetwork() {
/* 1 */             return this.component1;
                }

                public final boolean getMonetizationNetwork() {
/* 1 */             return this.areAllFieldsValid;
                }

                public final byte[] getRevenue() {
/* 1 */             return this.component3;
                }

/* 27 */        public AFd1bSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
/* 28 */            this(str, bArr, str2, map, z, (byte) 0);
                }

/* 28 */        public AFd1bSDK(String str, String str2) {
/* 29 */            this(str, null, str2, new HashMap(), false);
                }
            }
